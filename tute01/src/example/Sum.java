package example;

import java.util.Scanner;


// 1 2 34   76
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int res = 0;
        String[] numbers = scanner.nextLine().split(" ");

        for (String number : numbers) {
            int val = Integer.parseInt(number);
            res += val;
        }

        System.out.println("Result = " + res);

        scanner.close();

        Shouter shouter = new Shouter("hooray");


    }
}
