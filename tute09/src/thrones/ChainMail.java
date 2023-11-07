package thrones;

public class ChainMail extends BaseDecorator {
    public ChainMail(Character character) {
        super(character);
    }

    @Override
    public void damage(int points) {
        super.getCharacter().damage(points / 2);
    }
}
