package stream;

import java.util.Optional;

public class Opt {
    public static void main(String[] args) {
        Optional<String> x = Optional.of("Hello world!");
        if (x.isPresent()) {
            System.out.println(x.get());
        }

    }
}
