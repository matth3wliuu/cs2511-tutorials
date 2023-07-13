package calculator;

public class Subtraction extends BaseExpression {
    public Subtraction(Component left, Component right) {
        super(left, right);
    }

    public double compute() {
        return super.getLeft().compute() - super.getRight().compute();
    }
}
