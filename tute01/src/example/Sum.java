package example;

import java.util.Scanner;

/*
 * Write a program that uses the `Scanner` class
 * which reads in a line of numbers separated by spaces
 * from stdin, and sums them.
*/

// Read input such as "1 2 3 4 5"
// ["1", "2", "3", .. ]
// Print out the sum of 1 + 2 + 3 + 4 + 5 = 15

public class Sum {
    public static void main(String[] args) {
        // ? What do you think System.in is
            // stdin

        // the "new" keyword followed the constructor of a class creates an instance of that class
        Scanner scanner = new Scanner(System.in);

        // String line = scanner.nextLine();
        // String[] tokens = line.split(" ");
        String[] tokens = scanner.nextLine().split(" ");
        scanner.close();

        int result = 0;
        for (String token : tokens) {
            result += Integer.parseInt(token);
        }

        System.out.println("Result = " + result);
    }
}
