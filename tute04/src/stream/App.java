package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

        List<Integer> parsedStrings = strings
            .stream()
            .map(x -> Integer.parseInt(x))
            .collect(Collectors.toList());

        strings
            .stream()
            .map(x -> Integer.parseInt(x))
            .forEach(x -> System.out.println(x));
    }
}