package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        for (String string : strings) {
            System.out.println(string);
        }

        strings.stream().forEach(s -> System.out.println(s));
        Consumer<String> printer = (s) -> { System.out.println(s); };

        strings.stream().forEach(printer);

        List<String> strings2 = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        List<Integer> ints = new ArrayList<Integer>();
        for (String string : strings2) {
            ints.add(Integer.parseInt(string));
        }
        System.out.println(ints);

        List<Integer> numbers = strings2.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());

    }


}