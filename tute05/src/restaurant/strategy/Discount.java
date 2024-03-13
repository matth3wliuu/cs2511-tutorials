package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class Discount implements ChargingStrategy {
    @Override
    public double cost(List<Meal> order, boolean isMember) {
        if (isMember) {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.6).sum();
        }
        else {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.7).sum();
        }
    }

    @Override
    public double standardChargeModifier() {
        return 1.0;
    }
}
