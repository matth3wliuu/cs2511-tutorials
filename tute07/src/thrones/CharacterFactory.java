package thrones;

import java.util.Random;

public abstract class CharacterFactory {
    private static final int GRID_SIZE = 4;

    private static Random random = new Random(System.currentTimeMillis());

    protected static int getInitPosition() {
        return random.nextInt(GRID_SIZE);
    }

    public abstract Character createCharacter();
}
