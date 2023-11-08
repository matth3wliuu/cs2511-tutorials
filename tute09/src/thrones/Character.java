package thrones;

import java.util.List;

// ? What are the template methods in the Character interface?
// * makeMove is the template metho that is split into smaller steps

// ? What are the hook methods in the Character interface?
// * damage and attack methods

// ? What are the final methods in the Character interface?
// * getHealthPoints, getX

public interface Character {
    public int getHealthPoints();

    public int getX();

    public int getY();

    public void setX(int x);

    public void setY(int y);

    /**
     * Cause this character the given amount of damage.
     *
     * @param points
     */
    public void damage(int points);

    /**
     * This character attacks the given victim, causing them damage according to
     * their rules.
     *
     * @param victim
     */
    public void attack(Character victim);

    /**
     * Can this character move by the given amount along the x and y axes.
     *
     * @param x
     * @param y
     * @return True if they can move by that amount, false otherwise
     */
    public boolean canMove(int dx, int dy);

    // ? Follow up from last week. Why is the type of the characters variable specifically List<Character>
    // ? and not for example, ArrayList<Character>?
    // * List<Character> allows callers to pass me any type of lists possible

    public default MoveResult makeMove(int x, int y, List<Character> characters) {
        if (!canMove(this.getX() - x, this.getY() - y)) {
            return MoveResult.INVALID;
        }

        for (Character character : characters) {
            if (character != this && character.getX() == x && character.getY() == y) {
                attack(character);
                return MoveResult.ATTACK;
            }
        }

        this.setX(x);
        this.setY(y);

        return MoveResult.SUCCESS;
    }
}
