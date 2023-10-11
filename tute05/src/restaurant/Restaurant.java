package restaurant;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import restaurant.strategy.ChargingStrategy;
import restaurant.strategy.HappyHour;
import restaurant.strategy.StandardStategy;

public class Restaurant {

    private ChargingStrategy chargingStrategy = new StandardStategy();
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

    // ? How does this system violate open-closed principle
    // * Open closed principle: a class is open for extension but closed for modifications.
    // * this violates the open-closed principle because adding new strategies requires a new switch statement everytime.

    public double cost(List<Meal> order, String payee) {
        return this.chargingStrategy.cost(order, members.contains(payee));
    }

    public void displayMenu() {
        final double modifier = this.chargingStrategy.costMultiplier();

        for (Meal meal : menu) {
            System.out.println(meal.getName() + " - " + meal.getCost() * modifier);
        }
    }

    public void changeStrategy(ChargingStrategy newStrategy) {
        this.chargingStrategy = newStrategy;
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant("XS");
        r.displayMenu();

        r.changeStrategy(new HappyHour());
        r.displayMenu();
    }
}
