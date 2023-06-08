package shapes;

public class Shape {
    public String color;

    protected int shared;


    public Shape(String color) {
        System.out.println("Inside Shape constructor");
        this.color = color;
    }


    public static void main(String[] args) {
        Shape s = new Shape("red");

        Rectangle r = new Rectangle(null, 0, 0);
        // r.height = 5;
    }
}
