package calculator.composite;

public abstract class BinaryOperator implements Expression {
    // ? what should we store inside our binary operator?
    private Expression lhs;
    private Expression rhs;

    public BinaryOperator(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    protected Expression getLeft() {
        return lhs;
    }

    protected Expression getRight() {
        return rhs;
    }
}
