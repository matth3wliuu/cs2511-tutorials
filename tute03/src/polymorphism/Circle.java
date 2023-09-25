package polymorphism;

public class Circle implements Shape {
    private int x, y, r;
    private String colour;

    public Circle(int x, int y, int r, String colour) {
        this.x = x;
        this.y = y;
        this.colour = colour;
    }

    @Override
    public double area() {
        System.out.println("Inside area method for a Circle");
        return Math.PI * this.r * this.r;
    }

    @Override
    public void paint() {
        System.out.println("Painting a circle with x = " + this.x + " y = " + this.y
        + " and colour = " + this.colour);
    }
}
