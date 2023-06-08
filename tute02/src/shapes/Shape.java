package shapes;

public class Shape {
    private String color;

    protected int p;

    public Shape(String color) {
        System.out.println("Inside Shape constructor");
        this.color = color;
    }

    public static void main(String[] args) {
        Shape red = new Shape("red");

    }
}
