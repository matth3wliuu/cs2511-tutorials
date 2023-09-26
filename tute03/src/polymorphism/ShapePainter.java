package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapePainter {
    // * By storing a list of the "instances of Shape interface", we are
    // * to just have a single list as opposed a list of each different type of Shapes
    private List<Shape> shapes = new ArrayList<>();

    public void paintShapes() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            shape.paint();
            totalArea += shape.area();
        }

        System.out.println("I just painted a total surface area of " + totalArea + "m^2");
    }

    // * Since Rectangle and Circle implement the Shape interface, instances of Rectangle
    // * and Circle can be treated like an instance of Shape
    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5, 2, 1, "red");
        Shape c3 = new Circle(1, 2, 3, "black");
        Circle c2 = new Circle(10, 8, 2, "blue");
        Shape r1 = new Rectangle(2, 7);

        ShapePainter painter = new ShapePainter();

        painter.addShape(c1);
        painter.addShape(c2);
        painter.addShape(r1);
        painter.addShape(c3);

        painter.paintShapes();
    }
}
