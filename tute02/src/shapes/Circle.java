package shapes;

public class Circle extends Shape {

    private int x, y;
    private int r;
    private static final double pi = 3.14159;

    public static int numberOfCircles = 0;

    public Circle(String color) {
        super(color);
        numberOfCircles++;
    }

    public double circumference() {
        return 2 * Circle.pi * this.r;
    }

    public int x() {
        return this.x;
    }

    public int y() {
        return this.y;
    }
}