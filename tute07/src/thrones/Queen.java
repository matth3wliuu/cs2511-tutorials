package thrones;

public class Queen extends CharacterBase {
    public Queen(int x, int y) {
        super(x, y);
    }

    @Override
    public void attack(Character victim) {
        if (Math.random() * 3 < 1)
            victim.damage(12);
        else
            victim.damage(6);
    }

    @Override
    public boolean canMove(int dx, int dy) {
        return (dx == 0 || dy == 0 || Math.abs(dx) == Math.abs(dy));
    }
}
