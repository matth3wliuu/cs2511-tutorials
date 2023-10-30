package thrones;

import java.util.Random;

public class Game {

    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());

        King king = new King(random.nextInt(3), random.nextInt(3));
        Queen queen = new Queen(0, 1);
        Knight knight = new Knight(0, 2);

        // Dragon dragon = new Dragon(0, 0);
        // System.out.println("A new dragon has been created");

        // now i want to change the fact creaating a character should be in a 3x3 grid instead

        CharacterFactory dragonFactory = new DragonFactory();

        Character dragon = dragonFactory.createCharacter();

        CharacterFactory dragonFactory = new DragonFactory();
        Character d = dragonFactory.createCharacter();

        knight.attack(dragon);
    }
}