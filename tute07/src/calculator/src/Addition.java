public class Addition implements Expression {

    private Expression lhs;
    private Expression rhs;

    public Addition(Expression first, Expression second) {
        this.lhs = first;
        this.rhs = second;
    }

    @Override
    public double compute() {
        return lhs.compute() + rhs.compute();
    }
}
