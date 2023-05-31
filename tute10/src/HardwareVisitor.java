
public class HardwareVisitor implements Visitor {

    private boolean validated = false;

    @Override
    public void visit(Computer computer) {
        if (this.validated()) {
            System.out.println("Looking at Computer " + computer.toString() + " has " + computer.getMemory() + " Gb.");
        }
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Looking at keyboard...");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Looking at mouse...");
    }

    @Override
    public void validate() {
        this.validated = true;
    }

    @Override
    public boolean validated() {
        return this.validated;
    }


    public static void main(String[] args) {
        ComputerComponent computer = new Computer("Corelli", 500);
        Visitor visitor = new HardwareVisitor();

        visitor.validate();
        computer.accept(visitor);

        // ComputerComponent keyboard = new Keyboard("Mechanical keyboard");
        // ComputerComponent mouse = new Mouse("Bluetooth mouse");
    }

}
