package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapePainter {
    private List<Shape> shapes = new ArrayList<>();

    public void paintShapes() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            shape.paint();
            totalArea += shape.area();
        }

        System.out.println("I just painted a total surface area of " + totalArea + "m^2");
    }

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5, 2, 1, "red");
        Circle c2 = new Circle(10, 8, 2, "blue");

        Shape r1 = new Rectangle(2, 7);

        ShapePainter painter = new ShapePainter();
        painter.addShape(c1);
        painter.addShape(c2);
        painter.addShape(r1);

        painter.paintShapes();
    }
}
