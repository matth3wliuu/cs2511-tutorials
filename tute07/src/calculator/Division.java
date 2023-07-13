package calculator;

public class Division extends BaseExpression {
    public Division(Component left, Component right) {
        super(left, right);
    }

    public double compute() {
        return super.getLeft().compute() / super.getRight().compute();
    }
}
