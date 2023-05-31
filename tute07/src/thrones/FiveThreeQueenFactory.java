package thrones;

public class FiveThreeQueenFactory extends CharacterFactory2 {

    @Override
    public Character createCharacter() {
        return new Queen(5, 3);
    }

}
