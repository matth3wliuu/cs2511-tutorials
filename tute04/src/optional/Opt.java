package optional;

import java.util.Optional;
import java.util.function.Consumer;

public class Opt {
    public static void main(String[] args) {
        // * use the `of` and `empty` methods to construct instances of Optional<T>
        Optional<String> hasValue = Optional.of("Hello world!");
        Optional<String> noValue = Optional.empty();

        Optional<Integer> hello = Optional.of(123);

        // * equivalent to declaring a function in the local scope with argument type = Optional<String> and return type = void
        Consumer<Optional<String>> doSomething = (Optional<String> opt) -> {
            // * to access the value within an optional, you must first check if a value is present
            if (opt.isPresent()) {
                // * use the `get` method to extract the value within the optional
                System.out.println("The message within opt: " + opt.get());
            }
            else {
                System.out.println("This opt does not contain a value :(");
            }

            // * Optional class contain useful monadic operators like `ifPresentOrElse`
            // * `ifPresentOrElse` takes two functions as argument
            //      * 1. Handle the case where the optional has a value
            //      * 2. Handle the case where the optional does not have a value
            opt.ifPresentOrElse(
                // * argument 1
                (String value) -> System.out.println("The message within opt: " + value),
                // * argument 2
                () -> System.out.println("This opt does not contain a value :(")
            );

            System.out.println();
        };

        doSomething.accept(hasValue);
        doSomething.accept(noValue);
    }
}
