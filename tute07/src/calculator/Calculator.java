package calculator;

import calculator.composite.Addition;
import calculator.composite.Division;
import calculator.composite.Expression;
import calculator.composite.Leaf;
import calculator.composite.Multiplication;
import calculator.composite.Subtraction;

public class Calculator {
    public static double compute(Expression expression) {
        return expression.compute();
    }

    public static void main(String[] args) {
        // exp1 = 42
        Expression exp1 = new Leaf(42);
        System.out.println(Calculator.compute(exp1));

        // exp2 = ((1 + 2) - ((3 / 4) * 5))
        Expression lhs = new Addition(new Leaf(1), new Leaf(2));
        Expression rhs = new Multiplication(new Division(new Leaf(3), new Leaf(4)), new Leaf(5));
        Expression exp2 = new Subtraction(lhs, rhs);

        System.out.println(Calculator.compute(exp2));
    }
}
