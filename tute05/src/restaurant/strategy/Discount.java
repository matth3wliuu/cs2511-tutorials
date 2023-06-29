package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class Discount implements ChargingStrategy {

    private static double MULTIPLIER = 1.0;

    @Override
    public double cost(List<Meal> order, Boolean isMember) {
        if (isMember) {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.85).sum();
        }
        else {
            return order.stream().mapToDouble(meal -> meal.getCost()).sum();
        }
    }

    @Override
    public double costMultiplier() {
        return Discount.MULTIPLIER;
    }
}
