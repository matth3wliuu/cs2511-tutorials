package thrones;

public class DragonFactory extends CharacterFactory {

    @Override
    public Character createCharacter() {
        return new Dragon(super.randomInt(), super.randomInt());
    }
}
