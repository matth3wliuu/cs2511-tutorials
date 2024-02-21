package animal;

public class Dog extends Animal implements PlayCatch {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void playCatch() {
        System.out.println(this.getName() + "is playing catch");
    }
}
