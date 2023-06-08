package shapes;

public class Rectangle extends Shape {
    private int height;
    public int width;


    public Rectangle(String color) {
        super(color);
        System.out.println("Inside Rectangle constructor with one argument");
    }

    public Rectangle(String name, int width, int height) {
        this(name);
        this.width = width;
        this.setWidth(width);

        this.height = height;
        System.out.println("Inside Rectangle constructor with three arguments");
    }

    public void setWidth(int width) {
        if (width > 100) {
            return;
        }
        this.width = width;
    }

    public void hello() {
        super.color = "blue";
        this.width = 5;
        super.shared = 10;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle("red", 10, 20);
        r.hello();

        r.height = 1;
    }
}
