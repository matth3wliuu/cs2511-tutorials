package calculator;

import calculator.composite.Expression;

public class Calculator {
    public static double compute(Expression exp) {
        return exp.compute();
    }

    public static void main(String[] args) {
        // Example 1: exp1 = 42
        // Example 2: exp2 = ((1 + 2) - ((3 / 4) * 5))
    }
}
