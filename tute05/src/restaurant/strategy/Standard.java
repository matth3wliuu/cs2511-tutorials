package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class Standard implements ChargingStrategy {

    @Override
    public double cost(List<Meal> meals, Boolean isMember) {
        return meals.stream().mapToDouble(meal -> meal.getCost()).sum();
    }

    @Override
    public double costMultiplier() {
        return 1.0;
    }
}
