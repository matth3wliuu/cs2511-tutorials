package calculator;

import calculator.composite.Division;
import calculator.composite.Expression;
import calculator.composite.Leaf;
import calculator.composite.Multiplication;

public class Calculator {
    public static double compute(Expression exp) {
        return exp.compute();
    }

    public static void main(String[] args) {
        // exp1 = 42
        Expression exp1 = new Leaf(42);
        System.out.println(Calculator.compute(exp1));


        // exp2 = ((1 + 2) - ((3 / 4) * 5))
        // ? what is the outermost node we should construct
        Expression lhs = new Division(new Leaf(3), new Leaf(4));
        Expression exp2 = new Multiplication(lhs, new Leaf(5));

        System.out.println(Calculator.compute(exp2));
    }
}
