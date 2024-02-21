package shapes;

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(String color) {
        super(color);
        System.out.println("Inside Rectangle constructor with one argument");
    }

    // * Java will implciitly call the constructor of the super class if the super class has one and you do not explicity invoke one
    public Rectangle(String name, int width, int height) {
        this(name); //* this invokes the constructor on Line 7 */
        this.width = width;
        this.height = height;
        System.out.println("Inside Rectangle constructor with three arguments");
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle("red", 10, 20);
    }
}
