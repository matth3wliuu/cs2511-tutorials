package example;

import java.util.Scanner;

// 1, 2, 3, 4, 5
// 1 2 3 4 5
// ["1", "2", "3", "4", "5"]
// 15
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(", ");

        int sum = 0;
        for (String string : strings) {
            int num = Integer.parseInt(string);
            sum += num;
        }

        System.out.println(sum);

        scanner.close();
    }
}
