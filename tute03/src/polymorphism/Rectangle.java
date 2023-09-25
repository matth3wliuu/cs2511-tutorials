package polymorphism;

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
