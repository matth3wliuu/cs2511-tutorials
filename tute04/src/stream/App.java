package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        for (String string : strings) {
            System.out.println(string);
        }

        strings.stream().forEach(hello -> System.out.println(hello) );

        // use named lambda if you need use it multiple times
        Consumer<String> f = (hello) -> { System.out.println(hello); };
        strings.stream().forEach(f);


        List<String> strings2 = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        List<Integer> ints = new ArrayList<Integer>();
        for (String string : strings2) {
            ints.add(Integer.parseInt(string));
        }
        System.out.println(ints);

        List<Integer> ints2 = strings.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        System.out.println(ints2);


    }
}