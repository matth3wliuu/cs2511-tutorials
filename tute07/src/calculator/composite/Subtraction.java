package calculator.composite;

public class Subtraction implements Expression {
    private Expression lhs;
    private Expression rhs;

    public Subtraction(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public double compute() {
        return lhs.compute() - rhs.compute();
    }
}
