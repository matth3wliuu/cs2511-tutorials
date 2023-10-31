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

//? why couldn't we have done Stack<E> implements Iterable?
public class Stack<E> implements Iterable<E> {

    // [1, 2, 3, 4, 5]
    //        i
    private List<E> stack = new ArrayList<E>();

    /**
     * Pushes an element onto the top of the stack.
     * @param element
     */
    public void push(E element) {
        this.stack.add(element);
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return this.stack.size();
    }

    /**
     * Returns the top element of the stack, without removing it.
     */
    public Optional<E> peek() {
        if (this.stack.size() == 0) {
            return Optional.empty();
        }

        // * we want to return the element at the back of the list
        return Optional.of(this.stack.get(this.stack.size() - 1));
    }

    /**
     * Removes the top element of the stack, and returns that element.
     */
    public Optional<E> pop() {
        Optional<E> toReturn = peek();
        if (toReturn != Optional.empty()) {
            this.stack.remove(this.stack.size() - 1);
        }
        return toReturn;
    }

    /**
     * Returns the stack as an ArrayList
     */
    public ArrayList<E> toArrayList() {
        // ? why might this be not what we want?
        // * this violates encapsulation because the user can manipulate the internals without us knowing
        // return (ArrayList<E>) stack;

        return new ArrayList<E>(stack);
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        // ? why might this also not be what we want?
        // * we want to iterate from back to front since it's a stack

        List<E> copy = toArrayList();
        Collections.reverse(copy);
        return copy.iterator();
    }

    // ? Why didn't we just do Stack<Integer>
    // * Stack<Integer> forces the method to only allow an instance of Stack<Integer> to be passed in
    // * but what if we also want to allow subclasses of Integer

    /**
    * Returns the sum of a stack of integers
    */
    public static Integer sumStack(Stack<? extends Integer> st) {
        // ? x = st.get(0);

        // * this is not allowed in COMP2511
        // for (var x : st) {
            //     result += x;
        // }

        // List<? extends Integer> lst = st.toArrayList();
        // for (int i = 0; i < lst.size(); i++) {
        //     result += lst.get(i);
        // }

        Integer result = 0;
        Iterator<? extends Integer> iterator = st.iterator();
        while (iterator.hasNext()) {
            result += iterator.next();
        }

        return result;
    }

    /**
    * Pretty print a stack containing arbitrary elements, delimited by "," and enclosed by "[" and "]"
    */
    // 1, 2, 3, 4, 5 => [1, 2, 3, 4, 5 ]
    public static void prettyPrint(Stack<?> st) {

        // List<?> lst = st.toArrayList();
        // for (int i = 0; i < lst.size(); i++) {
        //     System.out.print(lst.get(i));
        //     if (i != lst.size() - 1) {
        //         System.out.print(", ");
        //     }
        // }

        System.out.print("[");
        Iterator<?> iter = st.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next());

            // check if we not at the last element
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