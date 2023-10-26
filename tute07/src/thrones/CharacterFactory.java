package thrones;

import java.util.Random;

public abstract class CharacterFactory {
    // * if you don't want reproduceable results: use the current time as the seed
    // * want to reproduce: use the same number as the seed every time
    private Random random = new Random(12);

    protected int getGridPosition() {
        // returns a number from 0 to 4 inclusive
        return random.nextInt(5);
    }

    public abstract Character createCharacter();
}


// seed = 12: 1, 3, 5, 2, 1

// another person constructs a random instance using seed = 12
// 1, 3, 5, 2, 1