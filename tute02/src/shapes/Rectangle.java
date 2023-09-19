package shapes;

// the class Rectanle is a SUBCLASS of the class Shape
// Rectangle has all the properties and funcitonalities of Shape

// * super: is a reference to the class
// * this: is a reference to the current class

// ? What is the differerence between super(...) and this(...)
// * super(...): a call to the constructor from your immediate parent class.
// * this(...): a call to a constructor from your current class.

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(String color) {
        super(color);
        System.out.println("Inside Rectangle constructor with one argument");

        // * subclasses cannot access private members of the superclass
        // System.out.println("colour = " + super.color);
    }

    public Rectangle(String name, int width, int height) {
        this(name);
        this.width = width;
        this.height = height;
        System.out.println("Inside Rectangle constructor with three arguments");
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle("red", 10, 20);

        Rectangle r1 = new Rectangle("blue");

        Shape s = new Shape("blue");
        System.out.println(s.color);

        // System.out.println(s.height);

        System.out.println(r1.color);
        System.out.println(r1.height);
    }
}
