package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

// * This class handles the Standard Charging Strategy
public class Standard implements ChargingStrategy {
    private final static double MODIFIER = 1.0;

    // ? What do I need to do to implement this method?
    @Override
    public double cost(List<Meal> order, boolean isMember) {
        return order.stream().mapToDouble(meal -> meal.getCost()).sum();
    }

    @Override
    public double standardChargeModifier() {
        return MODIFIER;
    }
}
