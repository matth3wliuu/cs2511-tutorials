package calculator;

public class Addition extends BaseExpression {
    public Addition(Component left, Component right) {
        super(left, right);
    }

    public double compute() {
        return super.getLeft().compute() + super.getRight().compute();
    }
}
