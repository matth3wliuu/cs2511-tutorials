package calculator;

public abstract class Composite implements Component {
    private Component right;
    private Component left;

    public Composite(Component left, Component right) {
        this.left = left;
        this.right = right;
    }

    public Component getLeft() {
        return this.left;
    }

    public Component getRight() {
        return this.right;
    }
}
