package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class StandardStrategy implements ChargingStrategy {

    @Override
    public double cost(List<Meal> order, Boolean isMember) {
        return order.stream().mapToDouble(meal -> meal.getCost()).sum();
    }

    @Override
    public double costMultiplier() {
        return 1.0;
    }

}
