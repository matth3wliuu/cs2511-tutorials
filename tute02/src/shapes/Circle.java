package shapes;

public class Circle extends Shape {

    private int x, y;
    private int r;
    public static final double pi = 3.14159;

    public static int numberOfCircles = 0;

    public Circle(String color) {
        super(color);
        numberOfCircles++;
    }

    public double circumference() {
        return 2 * Circle.pi * this.r;
    }

    public static double hello() {
        return 2 * Circle.pi;
    }

    public int x() {
        return this.x;
    }

    public int y() {
        return this.y;
    }

    public static void main(String[] args) {
        Circle c = new Circle("red");
        Shape s = new Shape("red");

        c.x = 5;


    }
}