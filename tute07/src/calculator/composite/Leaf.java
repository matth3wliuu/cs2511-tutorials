package calculator.composite;

public class Leaf implements Expression {
    public Leaf(double number) {
        this.number = number;
    }

    private double number;

    // ? what should the compute method for a node that contains just a number?
    @Override
    public double compute() {
        return number;
    }
}
