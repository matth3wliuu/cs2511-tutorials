package example;

/**
 * Prints "Hello World" to the console.
 *
 * @author Robert Clifton-Everest
 *
 */
public class HelloWorld {
    // ! Please have the line below in order to see the Run button
    public static void main(String[] args) {
        System.out.println("Hello world, my number is " + 5);

        /*
        Shouter shouter = Shouter();
        shouter.message = "new message";
            * This will not work because message is a private field of Shouter
        */
    }
}

// C and Java

// int x;
// x = "hello world"; // will not compile

//  C exclusive
// void* ptr = malloc(4 * size(int));
// free(ptr);


// * Java has a garbage collector that automatically frees any unused memory
// ? When can this be bad?
    // Reduces the performance of your overall system

// Python

// y = "hello world"
// y = 4