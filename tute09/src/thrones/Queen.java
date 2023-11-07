package thrones;

/**
 * A queen can move to any square in the same column, row or diagonal as she is
 * currently on, and has a 1 in 3 chance of inflicting 12 points of damage or a
 * 2 out of 3 chance of inflicting 6 points of damage.
 *
 * @author Robert Clifton-Everest
 *
 */
public class Queen extends CharacterBase {

    public Queen(int x, int y) {
        super(x, y);
    }

    @Override
    public void attack(Character victim) {
        final int damage = Math.random() <= 1 / 3 ? 12 : 6;
        victim.damage(damage);
    }

    @Override
    public boolean canMove(int dx, int dy) {
        // same column => dx = 0 and dy = any value
        // same row => dx = any value and dy = 0
        // same diagonal => abs(dx) == abs(dy)
        return (dx == 0 || dy == 0 || dx == dy);
    }
}
