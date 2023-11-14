public class Computer implements ComputerComponent {
    private String name;
    private int memory;

    public Computer(String name, int memory) {
        this.name = name;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public void accept(ComputerVisitor v) {
        // perform whatever logic you need before the visitor performs visit

        // we pass 'this' into the method because this is the only ComputerComponent we have access
        // to in this method

        // * check if visitor is validated before letting it visit me

        v.visit(this);
    }
}