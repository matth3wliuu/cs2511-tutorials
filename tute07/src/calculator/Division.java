package calculator;

public class Division extends Composite {
    public Division(Component left, Component right) {
        super(left, right);
    }

    public double compute() {
        return getLeft().compute() / getRight().compute();
    }
}
