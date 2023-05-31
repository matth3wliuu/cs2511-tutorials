package thrones;

public class HelmetDecorator extends CharacterDecorator {

    public HelmetDecorator(CharacterBehaviour character) {
        super(character);
    }

    @Override
    public void damage(int points) {
        super.damage(points - 1);
    }
}
