package calculator.composite;

// ? what am i missing in this class?
// ? how can i implement the compute method?
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
