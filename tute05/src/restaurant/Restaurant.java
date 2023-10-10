package restaurant;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import restaurant.strategy.ChargingStrategy;
import restaurant.strategy.DiscountStrategy;
import restaurant.strategy.StandardStrategy;

public class Restaurant {
    private ChargingStrategy chargingStrategy = new StandardStrategy();

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

    // ? How does the system violate the open-closed principle
    // * Open-closed principle: a class should closed for modification but open for extension.
    // * Need to add a new switch statement condition every time we want a new type of charging strategy.

    // ? Why does the new implementation not violate the open-closed principle?
    // Adding a new strategy does not involve the any existing classes to be modified. Instead,
    // we simply need to add a new class that implements the ChargingStrategy interface.

    public double cost(List<Meal> order, String payee) {
        return chargingStrategy.cost(order, this.members.contains(payee));
    }

    public void displayMenu() {
        final double modifier = chargingStrategy.costMultiplier();
        for (Meal meal : menu) {
            System.out.println(meal.getName() + " - " + meal.getCost() * modifier);
        }
    }

    public void setStrategy(ChargingStrategy newStrategy) {
        this.chargingStrategy = newStrategy;
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant("XS");
        r.displayMenu();

        System.out.println();

        r.setStrategy(new DiscountStrategy());
        r.displayMenu();
    }
}
