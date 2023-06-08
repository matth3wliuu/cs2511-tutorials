package shapes;

public class Circle extends Shape {

    private int x, y;
    private int r;
    private static final double pi = 3.14159;

    public static int numberOfCircles = 0;

    private Circle(String color) {
        super(color);
        numberOfCircles++;
    }

    public double circumference() {
        return 2 * Circle.pi * this.r;
    }

    public static double pi() {
        int myX = this.x;

        return pi;
    }

    public int x() {
        return this.x;
    }

    public int y() {
        return this.y;
    }


    public static void main(String[] args) {
        Circle c1 = new Circle("red");
        Circle c2 = new Circle("blue");

        System.out.println(Circle.numberOfCircles);

        Rectangle r = new Rectangle(null, numberOfCircles, numberOfCircles);

        r.height = 5;

        double p = Circle.pi();
        System.out.println(p);


    }
}