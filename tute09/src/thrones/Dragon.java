package thrones;

/**
 * A dragon can only move up, down, left or right, and has a 1 in 6 chance of
 * inflicting 20 points of damage.
 *
 * @author Robert Clifton-Everest
 *
 */
public class Dragon extends CharacterBase {
    public Dragon(int x, int y) {
        super(x, y);
    }

    @Override
    public void attack(Character victim) {
        if (Math.random() > 1 / 6) {
            victim.damage(20);
        }
    }

    @Override
    public boolean canMove(int dx, int dy) {
        return dx + dy <= 1;
    }
}
