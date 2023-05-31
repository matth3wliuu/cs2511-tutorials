package thrones;

public class ChainmailDecorator extends CharacterDecorator {

    public ChainmailDecorator(Character character) {
        super(character);
    }

    @Override
    public void damage(int points) {
        super.damage(points / 2);
    }
}
