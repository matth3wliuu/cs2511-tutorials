package calculator;

public class Subtraction extends Composite {
    public Subtraction(Component left, Component right) {
        super(left, right);
    }

    public double compute() {
        return getLeft().compute() - getRight().compute();
    }
}
