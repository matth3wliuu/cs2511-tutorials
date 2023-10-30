package thrones;

// This will look identical to the Dragon Factory for this exercise
public class QueenFactory {

}
package thrones;

public class QueenFactory extends CharacterFactory {

    @Override
    public Character createCharacter() {
        return new Queen(0, 0);
    }

}
