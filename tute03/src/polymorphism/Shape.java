package polymorphism;

import java.util.ArrayList;
import java.util.List;

public interface Shape {
    public default double area() {
        return 0.0;
    }

    public void paint();
}

// public abstract class Shape {

//     private int counter;

//     public double area();
//     public void paint();
// }


// * Aggregation relationship: If an instance of CSE gets destroyed,
// * instances of students within should not be destroyed.
class CSE {
    private List<Student> students = new ArrayList<>();
}

// * Class CSE has a one-to-many relationship with the class Student
// this is because CSE is able to store multiple instances of Students.

class Student {

}

// * Composition relationship: If Car gets destroyed, instance of Wheel
// inside Car should also be destroyed.
class Car {
    private Wheel wheel;

}

class Wheel {

}