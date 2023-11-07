package thrones;

public abstract class BaseDecorator implements Character {
    private Character wrappee;

    public BaseDecorator(Character character) {
        this.wrappee = character;
    }

    public Character getCharacter() {
        return wrappee;
    }

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
