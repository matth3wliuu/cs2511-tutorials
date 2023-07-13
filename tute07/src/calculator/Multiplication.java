package calculator;

public class Multiplication extends Composite {
    public Multiplication(Component left, Component right) {
        super(left, right);
    }

    public double compute() {
        return getLeft().compute() * getRight().compute();
    }
}
