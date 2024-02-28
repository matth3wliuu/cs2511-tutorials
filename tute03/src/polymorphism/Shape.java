package polymorphism;


// ? Why did I use an interface here? When should we use abstract classes instead?
// * We don't need any variables in this interface
// * Any class can only extend from one class, but they implement as many interfaces
// as they like. We add flexibility to our design

// * If we need to store any variables, then we should use an abstract class

public interface Shape {
    public abstract double area();
    public abstract void paint();
}
