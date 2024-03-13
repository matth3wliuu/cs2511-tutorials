package animal;

<<<<<<< HEAD
// * Users cannot instantiate instances of an abstract class
public abstract class Animal {
=======
public class Animal {
>>>>>>> cdfe0542a309857a0a25385806d0552b24e45b93
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
<<<<<<< HEAD

    // * All subclasses must provided an implementation for this method
    public abstract void makeSound();

    public static void main(String[] args) {
        // Animal animal = new Animal();
    }
=======
>>>>>>> cdfe0542a309857a0a25385806d0552b24e45b93
}
