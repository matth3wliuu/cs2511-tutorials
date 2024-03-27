package thrones;

public class Helmet extends CharacterDecorator {
    public Helmet(Character character) {
        super(character);
    }

    // * What can i do to reduce the damage wrappee takes by one when it's attacked?
    @Override
    public void damage(int points) {
        // we can't access wrappee because it's private field
        // wrappee.damage(points - 1);

        super.damage(points - 1);
    }
}
