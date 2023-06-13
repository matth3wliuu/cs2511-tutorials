
package static_functions;

// ! PLEASE DO NOT HAVE MULTIPLE CLASSES IN THE SAME FILE
// ! THIS IS JUST A DEMO

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String growl() {
        return "Growl!";
    }

    public String getName() {
        return this.name;
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String growl() {
        return "Meow";
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String growl() {
        return "Woof!";
    }
}

class SoundRecorder {
    public static void record(Animal animal) {
        System.out.println(animal.getName() + " is recorded to have growl: " + animal.growl());
    }
}


public class Animals {

    public static void main(String[] args) {
        // Dog mochi = new Dog("Mochi");
        // Cat matcha = new Cat("Matcha");
        // SoundRecorder.record(mochi);
        // SoundRecorder.record(matcha);

        // Animal latte = new Dog("Latte");
        // SoundRecorder.record(latte);

        // ! DO NOT USE `var` THIS IS JUST A DEMO
        // var mystery = (Animal) new Cat("Mystery");
        // SoundRecorder.record(mystery);
    }
}