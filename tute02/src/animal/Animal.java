package animal;

// * Users cannot instantiate instances of an abstract class
public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // * All subclasses must provided an implementation for this method
    public abstract void makeSound();

    public static void main(String[] args) {
        // Animal animal = new Animal();
    }
}
