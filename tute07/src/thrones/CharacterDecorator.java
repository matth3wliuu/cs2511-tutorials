package thrones;

public abstract class CharacterDecorator implements Character {
    private Character wrappee;

    public CharacterDecorator(Character character) {
        this.wrappee = character;
    }

    // * Method forwarding: I'm forwarding the implementation from the character I'm wrapping out
    @Override
    public int getHealthPoints() {
        return wrappee.getHealthPoints();
    }

    @Override
    public int getX() {
        return wrappee.getX();
    }

    @Override
    public int getY() {
        return wrappee.getY();
    }

    @Override
    public void setX(int x) {
        wrappee.setX(x);
    }

    @Override
    public void setY(int y) {
        wrappee.setY(y);
    }

    @Override
    public void damage(int points) {
        wrappee.damage(points);
    }

    @Override
    public void attack(Character victim) {
        wrappee.attack(victim);
    }

    @Override
    public boolean canMove(int dx, int dy) {
        return wrappee.canMove(dx, dy);
    }

}
