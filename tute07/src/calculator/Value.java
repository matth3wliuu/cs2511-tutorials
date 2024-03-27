package calculator;

import calculator.composite.Expression;

public class Value implements Expression {
    private double number;

    // ? what argument(s) should i have in my constructor?
    public Value(double value) {
        this.number = value;
    }

    @Override
    public double compute() {
        return this.number;
    }
}
