package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/**
 * A Simple Stack.
 * @param <E>
 *
 */
public class Stack<E> implements Iterable<E> {

    private List<E> stack = new ArrayList<>();

    /**
     * Pushes an element onto the top of the stack.
     * @param element
     */
    public void push(E element) {
        stack.add(element);
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return stack.size();
    }

    /**
     * Returns the top element of the stack, without removing it.
     */
    public Optional<E> peek() {
        if (size() == 0) {
            return Optional.empty();
        }

        return Optional.of(stack.get(size() - 1));
    }

    /**
     * Removes the top element of the stack, and returns that element.
     */
    public Optional<E> pop() {
        Optional<E> toReturn = peek();
        if (toReturn != Optional.empty()) {
            stack.remove(size() - 1);
        }
        return toReturn;
    }

    /**
     * Returns the stack as an ArrayList
     */
    public ArrayList<E> toArrayList() {
        // ? why is this undesirable?
        // * it breaks encapsulations because users can manipulate the array list in ways we don't expect
        // return (ArrayList<E>) stack;

        return new ArrayList<E>(stack);
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        List<E> copy = toArrayList();
        Collections.reverse(copy);
        return copy.iterator();
    }

    // ? Why didn't we just do Stack<Integer>

    /**
    * Returns the sum of a stack of integers
    */
    public static Integer sumStack(Stack<? extends Integer> st) {
        // * not allowed in comp2511
        // Integer result = 0;
        // for (var x : st) {
            //     result += x;
            // }
            // return result;

        Integer result = 0;
        Iterator<? extends Integer> iter = st.iterator();
        while (iter.hasNext()) {
            result += iter.next();
        }
        return result;
    }

    /**
    * Pretty print a stack containing arbitrary elements, delimited by "," and enclosed by "[" and "]"
    */
    // [1, 2, 3]
    public static void prettyPrint(Stack<?> st) {
        System.out.print("[");
        Iterator<?> iter = st.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next());
            if (iter.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
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