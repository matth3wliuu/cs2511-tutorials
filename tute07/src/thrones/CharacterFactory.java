package thrones;

import java.util.Random;

public class CharacterFactory {
    // ? If I want to store the characters in a random position, what can i use to generate a random x and y

    // The argument is what we call a 'seed' to the number generator
    // The seed will force the random generator to generate the same sequence of numbers of every time
    // If seed = 42: 1, 3, 7, 8, ... every time
    private static int gridSize = 7;

    private static Random randomGenerator = new Random(42);

    public static Character constructKing() {
        // * nextInt will grab a number from the random number generator
        // 1, 3
        return new King(randomGenerator.nextInt(gridSize), randomGenerator.nextInt(gridSize));
    }

    public static Character constructQueen() {
        // 7, (8 mod 7)
        return new Queen(randomGenerator.nextInt(gridSize), randomGenerator.nextInt(gridSize));
    }
}
