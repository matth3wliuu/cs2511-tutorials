
public class ComputerVisitor implements Visitor {
    private boolean validated = false;

    public void validate() {
        validated = true;
    }

    public boolean isValidated() {
        return validated;
    }

    @Override
    public void visit(Computer computer) {
        if (isValidated()) {
            System.out.println("Looking at " + computer + " with " + computer.getMemory() + " GB of memory");
        }
        else {
            System.out.println("Not validated yet");
        }
    }

    // * question 30 of Kahoot
    public <T> void print(T item) {
        System.out.println(item);
    }

    // * question 31 of Kahoot
    // * Box<T extends Number>

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Looking at " + keyboard + " which has " + keyboard.getNumKeys() + " keys");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Looking at " + mouse);
    }

    public static void main(String[] args) {
        ComputerComponent computer = new Computer("Corelli", 500);
        ComputerComponent keyboard = new Keyboard("Mechanical keyboard");
        ComputerComponent mouse = new Mouse("Bluetooth mouse");
        ComputerVisitor visitor = new ComputerVisitor();

        keyboard.accept(visitor);
        mouse.accept(visitor);

        computer.accept(visitor);

        visitor.validate();
        computer.accept(visitor);
    }
}