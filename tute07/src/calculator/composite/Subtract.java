package calculator.composite;

public class Subtract extends BinaryOperator {
    public Subtract(Expression lhs, Expression rhs) {
        super(lhs, rhs);
    }

    @Override
    public double compute() {
        // Expression (-) Expression

        // (1 + 2) (-) (3 * 4)
        // 3 (-) (3 * 4)
        // 3 (-) (12)

        // ? how can evaluate the result of this overall expression?

        // * Is there any data types that we can subtract from each other?
        // When we call the `compute` method on an expression, we "convert" the expression into a double

        return getLeft().compute() - getRight().compute();
    }
}
