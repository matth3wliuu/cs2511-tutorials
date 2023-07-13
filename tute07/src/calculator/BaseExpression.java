package calculator;

public abstract class BaseExpression implements Component {
    private Component left;
    private Component right;

    public BaseExpression(Component left, Component right) {
        this.left = left;
        this.right = right;
    }

    public Component getLeft() {
        return this.left;
    }

    public Component getRight() {
        return this.right;
    }

    public abstract double compute();
}
