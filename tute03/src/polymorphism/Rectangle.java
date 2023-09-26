package polymorphism;

// * implements: Rectangle must provide an implementation for all methods defined in the Shape
// * interface

// ? how to decide between interface and abstract class
// * in interface, you cannot define any member variables
// * but this is possible in an abstract class

public class Rectangle implements Shape {
    private int b, h;

    public Rectangle(int b, int h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public double area() {
        System.out.println("Inside area method of Rectangle");
        return this.b * this.h;
    }

    @Override
    public void paint() {
        System.out.println("Paining a rectangle with base = " + this.b + " height = " + this.h);
    }
}
