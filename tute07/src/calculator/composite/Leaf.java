package calculator.composite;

public class Leaf implements Expression {
    private double number;

    public Leaf(double number) {
        this.number = number;
    }

    @Override
    public double compute() {
        return number;
    }
}
