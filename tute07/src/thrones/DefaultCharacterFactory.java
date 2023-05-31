package thrones;

public class DefaultCharacterFactory extends CharacterFactory {

    @Override
    public Character createDragon() {
        return new Dragon(0, 0);
    }

    @Override
    public Character createQueen() {
        return new Queen(0, 0);
    }

}
