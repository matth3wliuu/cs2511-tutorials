public class Division implements Expression {
    private Expression lhs;
    private Expression rhs;

    public Division(Expression first, Expression second) {
        this.lhs = first;
        this.rhs = second;
    }

    @Override
    public double compute() {
        return lhs.compute() / rhs.compute();
    }
}
