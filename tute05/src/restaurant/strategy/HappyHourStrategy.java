package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class HappyHourStrategy implements ChargingStrategy {

    @Override
    public double cost(List<Meal> order, Boolean isMember) {
        if (isMember) {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.6).sum();
        }
        else {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.7).sum();
        }
    }

    @Override
    public double costMultiplier() {
        return 0.7;
    }
}
