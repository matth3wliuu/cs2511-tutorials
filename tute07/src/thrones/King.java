package thrones;

public class King extends CharacterBase {
    public King(int x, int y) {
        super(x, y);
    }

    @Override
    public void attack(Character victim) {
        victim.damage(8);
    }

    @Override
    public boolean canMove(int dx, int dy) {
        dx = Math.abs(dx);
        dy = Math.abs(dy);
        return (dx == 1 && dy <= 1 || dx <= 1 && dy == 1);
    }
}
