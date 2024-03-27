package thrones;

public class Game {
    public static void main(String[] args) {
        King king = new King(0, 0);
        Queen queen = new Queen(0, 1);

        // * Requirement is that all character live in a random position in a 5 x 5 grid
        // ! problematic if we change th requirement

        King king2 = new King(2, 3);

        // * This queen is now guaranteed to be in a random position of our 5 x 5 grid
        // * This logic ^ is completed decoupled / unknown to the client (Game)
        Character queen2 = CharacterFactory.constructQueen();

        Character queenWithHelmet = new Helmet(queen2);
        Character queenWith2Helmets = new Helmet(queenWithHelmet);
    }
}
