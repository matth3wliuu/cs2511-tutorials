package thrones;

public class QueenFactory extends CharacterFactory {

    @Override
    public Character createCharacter() {
        return new Queen(0, 0);
    }

}
