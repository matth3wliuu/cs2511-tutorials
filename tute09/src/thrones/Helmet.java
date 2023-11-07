package thrones;

public class Helmet extends BaseDecorator {
    public Helmet(Character character) {
        super(character);
    }

    @Override
    public void damage(int points) {
        super.getCharacter().damage(points - 1);
    }
}
