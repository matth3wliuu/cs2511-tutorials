package calculator;

import calculator.composite.Addition;
import calculator.composite.Expression;
import calculator.composite.Multiply;
import calculator.composite.Subtract;

public class Calculator {
    public static double compute(Expression exp) {
        return exp.compute();
    }

    public static void main(String[] args) {
        // Example 1: exp1 = 42
        Expression exp1 = new Value(42);

        // Example 2: exp2 = ((1 + 2) - ((3 / 4) * 5))
        Expression exp2 = new Subtract(
            new Addition(
                new Value(1),
                new Value(2)
            ),
            new Multiply(
                new Value(0.75),
                new Value(5))
            );

        System.out.println(compute(exp1));
        System.out.println(compute(exp2));
    }
}
