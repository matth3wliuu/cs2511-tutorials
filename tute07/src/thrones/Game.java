package thrones;

public class Game {


    public static void main(String[] args) {
        King king = new King(0, 0);
        Queen queen = new Queen(0, 1);
        Knight knight = new Knight(0, 2);
        Dragon dragon = new Dragon(-1, 0);

        CharacterFactory dragonFactory = new DragonFactory();
        Character d = dragonFactory.createCharacter();

        CharacterFactory dragonFactory = new DragonFactory();
        Character d = dragonFactory.createCharacter();

        // * we have abstracted the fact the factory is returning dragons
        // * reduce coupling because clients no longer have access to
        // * methods that exist in the Dragon class
        knight.attack(dragon);
    }

}