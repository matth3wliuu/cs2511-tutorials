package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public interface ChargingStrategy {
    // Calculate the cost of their order.
    public double cost(List<Meal> order, boolean isMember);

    // Modifying factors of charges for customers.
    public double standardChargeModifier();
}
