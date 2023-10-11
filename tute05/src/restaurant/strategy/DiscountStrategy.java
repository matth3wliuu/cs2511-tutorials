package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class DiscountStrategy implements ChargingStrategy {
    @Override
    public double cost(List<Meal> order, boolean isMember) {
         if (isMember) {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.85).sum();
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost()).sum();
        }
    }

    @Override
    public double costMultiplier() {
        return 1.0;
    }
}
