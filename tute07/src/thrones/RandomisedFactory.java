
package thrones;

import java.util.Random;


public class RandomisedFactory {

    private Random random = new Random(System.currentTimeMillis());

    public Character createQueen() {
        int x = random.nextInt(4);
        int y = random.nextInt(4);

        return new Queen(x, y);
    }
}
