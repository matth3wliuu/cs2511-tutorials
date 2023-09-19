package shapes;

// In COMP1531, constants was defined using the keyword `const`

// In Java, if a variable is final, this means that the variable cannot be modified.
public class Circle extends Shape {

    private int x, y;
    private int r;

    // pi belongs to class Circle and not any particular instances of Circle
    // this allows us to share the value of pi between all instances of Circle;
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

    // static can be applied to functions as well as variables.
    public static void printPi() {
        System.out.println(Circle.pi);
    }

    // ? where else have we already seen static functions being used?

    public static void main(String[] args) {
        Circle circle1 = new Circle("red");

        // * this is an example of static functions being used because we did not
        // * create an instance of System to be able to use this method.
        System.out.println(Circle.numberOfCircles);

        // Circle circle2 = new Circle("blue");
        // System.out.println(Circle.numberOfCircles);

        Circle.printPi();
    }
}