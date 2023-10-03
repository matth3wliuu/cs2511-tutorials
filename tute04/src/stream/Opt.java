package stream;

import java.util.Optional;

public class Opt {
    public static void main(String[] args) {
        Optional<String> x = Optional.of("Hello world!");

        // the variable could contain a string or not

        // System.out.println(x.toUpperCase());

        // String y = null;
        // System.out.println(y.toUpperCase());

        if (x.isPresent()) {
            x.get();
        }
        else {

        }
    }
}
