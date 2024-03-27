package calculator.composite;

public class Multiply extends BinaryOperator {
    public Multiply(Expression lhs, Expression rhs) {
        super(lhs, rhs);
    }

    @Override
    public double compute() {
        return getLeft().compute() * getRight().compute();
    }
}
