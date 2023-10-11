package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class Holiday implements ChargingStrategy {
    private static final double MULTIPLIER = 1.15;

    @Override
    public double costMultiplier() {
        return Holiday.MULTIPLIER;
    }

    @Override
    public double cost(List<Meal> order, boolean isMember) {
        return order.stream().mapToDouble(meal -> meal.getCost() * 1.15).sum();
    }
}
