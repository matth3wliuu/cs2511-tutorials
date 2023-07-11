package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class HappyHour implements ChargingStrategy {

    @Override
    public double cost(List<Meal> meals, Boolean isMember) {
        if (isMember) {
                return meals.stream().mapToDouble(meal -> meal.getCost() * 0.6).sum();
        } else {
            return meals.stream().mapToDouble(meal -> meal.getCost() * 0.7).sum();
        }
    }

    @Override
    public double costMultiplier() {
        return 0.7;
    }
}
