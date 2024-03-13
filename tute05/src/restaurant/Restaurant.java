package restaurant;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import restaurant.strategy.ChargingStrategy;
import restaurant.strategy.Standard;

public class Restaurant {
    // private String chargingStrategy = "standard";
    private ChargingStrategy chargingStrategy = new Standard();

    private String name;
    private List<Meal> menu = new ArrayList<Meal>();
    private List<String> members = new ArrayList<String>();

    public Restaurant(String name) {
        this.name = name;
        JSONArray menuJSON = JSONHelper.readInData("src/restaurant/prices.json");

        for (Object Meal : menuJSON) {
            JSONObject jsonMeal = (JSONObject) Meal;
            menu.add(new Meal(jsonMeal.getString("meal"), jsonMeal.getInt("cost")));
        }
    }

    public double cost(List<Meal> order, String payee) {
        // ? why does this switch statement break the open-close principle?
        // * Open-close principle: a class should be CLOSED for modification and OPEN for extension.
        // * Akshar: we need a new switch statement for each each type of charging strategy
        final boolean isMember = members.contains(payee);

        //? How can i calculate the cost of someone's order using the new system?
        // * Delegate the computation to the specific strategy
        return this.chargingStrategy.cost(order, isMember);
    }

    public void displayMenu() {
        final double modifier = this.chargingStrategy.standardChargeModifier();

        for (Meal meal : menu) {
            System.out.println(meal.getName() + " - " + meal.getCost() * modifier);
        }
    }

    // ? Is there anything that we're missing?
    // * Need a way to change our strategy

    public void setStrategy(ChargingStrategy newStrategy) {
        this.chargingStrategy = newStrategy;
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant("XS");
        r.displayMenu();
    }
}
