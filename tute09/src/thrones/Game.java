package thrones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Plays the game with a command line interface.
 *
 * @author Nick Patrikeos
 */
public class Game {

    private List<Character> characters = new ArrayList<Character>();

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        for (Character character : characters) {
            System.out.print("Move " + character + " to: ");
            String[] line = scanner.nextLine().split(" ");
            x = Integer.parseInt(line[0]);
            y = Integer.parseInt(line[1]);

            MoveResult result = character.makeMove(x, y, characters);

            if (result.equals(MoveResult.SUCCESS)) {
                System.out.println("Success! Character is now " + character);
            } else if (result.equals(MoveResult.INVALID)) {
                System.out.println("Invalid move.");
            } else if (result.equals(MoveResult.ATTACK)) {
                System.out.println("Attacked another character.");
            }
        }

        scanner.close();
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }


    public static void main(String[] args) {
        Game game = new Game();

        game.addCharacter(new Dragon(0, 0));
        game.addCharacter(new Knight(1, 2));

        game.addCharacter(new King(0, 0));
        // TODO: construct a Queen wearing 1 HelmetDecorator and 1 ChainmailDecorator

        Character queen = new Queen(0, 0);
        Character helmetedQueen = new Helmet(queen);
        Character opQueen = new ChainMail(helmetedQueen);

        game.addCharacter(helmetedQueen);
        game.addCharacter(opQueen);

        game.play();
    }
}