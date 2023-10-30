package stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

/**
 * A Simple Stack.
 * @param <E>
 *
 */
public class Stack<E> implements Iterable<E> {

    /**
     * Pushes an element onto the top of the stack.
     * @param element
     */
    public void push(E element) {
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return -1;
    }

    /**
     * Returns the top element of the stack, without removing it.
     */
    public Optional<E> peek() {
        return Optional.empty();
    }

    /**
     * Removes the top element of the stack, and returns that element.
     */
    public Optional<E> pop() {
        return Optional.empty();
    }

    /**
     * Returns the stack as an ArrayList
     */
    public ArrayList<E> toArrayList() {
        return null;
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        return null;
    }

    // ? Why didn't we just do Stack<Integer>

    /**
    * Returns the sum of a stack of integers
    */
    public static Integer sumStack(Stack<? extends Integer> st) {
        return 0;
    }

    /**
    * Pretty print a stack containing arbitrary elements, delimited by "," and enclosed by "[" and "]"
    */
    public static void prettyPrint(Stack<?> st) {
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("hello");
        stack.push("how");
        stack.push("are");
        stack.push("you");
        stack.push("today");
        prettyPrint(stack);
    }

}