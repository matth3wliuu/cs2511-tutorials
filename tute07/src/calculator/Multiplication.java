package calculator;

public class Multiplication extends BaseExpression {
    public Multiplication(Component left, Component right) {
        super(left, right);
    }

    public double compute() {
        return super.getLeft().compute() * super.getRight().compute();
    }
}
