package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        for (String string : strings) {
            System.out.println(string);
        }

        List<Integer> ints = new ArrayList<Integer>();
        for (String string : strings) {
            ints.add(Integer.parseInt(string));
        }
        System.out.println(ints);
    }
}