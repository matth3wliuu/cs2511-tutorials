
public interface Visitor {
    public void visit(Computer computer);
    public void visit(Keyboard keyboard);
    public void visit(Mouse mouse);

    public void validate();
    public boolean validated();
}
