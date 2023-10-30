package thrones;

import java.util.Random;

public abstract class CharacterFactory {
    private Random random = new Random(42);

    protected int randomInt() {
        return random.nextInt(5);
    }

    public abstract Character createCharacter();
}

// seed = 4
// 1, 2, 4, 5, ..
