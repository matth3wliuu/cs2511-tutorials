package calculator;

public class Addition extends Composite {
    public Addition(Component left, Component right) {
        super(left, right);
    }

    public double compute() {
        return getLeft().compute() + getRight().compute();
    }
}
