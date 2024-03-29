package calculator.composite;

public class Addition implements Expression {
    private Expression lhs;
    private Expression rhs;

    public Addition(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public double compute() {
        return lhs.compute() + rhs.compute();
    }
}
