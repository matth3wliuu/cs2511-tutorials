package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class StandardStategy implements ChargingStrategy {
    private static final double MULTIPLIER = 1.0;

    @Override
    public double cost(List<Meal> order, boolean isMember) {
        return order.stream().mapToDouble(meal -> meal.getCost()).sum();
    }

    @Override
    public double costMultiplier() {
       return MULTIPLIER;
    }

}
