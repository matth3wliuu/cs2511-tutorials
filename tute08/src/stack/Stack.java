package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;


// ? What is the Iterable interface?
// * defines something that can be looped over

// * iterators are similar to an index in an array
// * [1, 2, 3, 4]
//                i ->
// iterator: construct that allow us to traverse some sort of collection

/**
 * A Simple Stack.
 * @param <E>
 *
 */
public class Stack<E> implements Iterable<E> {

    private List<E> lst = new ArrayList<>();

    /**
     * Pushes an element onto the top of the stack.
     * @param element
     */
    public void push(E element) {
        lst.add(element);
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return lst.size();
    }

    /**
     * Returns the top element of the stack, without removing it.
     */
    public Optional<E> peek() {
        if (size() == 0) {
            return Optional.empty();
        }
        // ? how can i get the top element of my stack?
        // element at the end of the array list

        return Optional.of(lst.get(size() - 1));
    }

    /**
     * Removes the top element of the stack, and returns that element.
     */
    public Optional<E> pop() {
        Optional<E> top = peek();
        if (top != Optional.empty()) {
            lst.remove(size() - 1);
        }
        return top;
    }

    /**
     * Returns the stack as an ArrayList
     */
    public ArrayList<E> toArrayList() {
        // ? what is undiserable about this implementation? (hint: something related to a design principle)
        // * breaking encapsulation because Java is pass by reference and user can manipulate the underlying
        // * list in ways that violate the principles of a stack
        // return (ArrayList<E>) lst;

        // * constructs a new array list containing the elements of lst
        return new ArrayList<E>(lst);
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        // ? what is undesirable about this implementation? (it's different from above)
        // * array list iterator is from left to right. but we want right to left

        List<E> copy = toArrayList();
        Collections.reverse(copy);

        return copy.iterator();
    }

    // ? What does ? extends T means
    // * accept any type that is either T or subclasses of T

    // ? Why didn't we just do Stack<Integer>
    // * it will only accept Stack containing exactly Integer
    // * but we want classses like class MyInteger extends Integer to also work

    // ? difference between ? and T
    //  E first = copy.get(0);
    // ? first = copy.get(0);  => does not work

    /**
    * Returns the sum of a stack of integers
    */
    public static Integer sumStack(Stack<? extends Integer> st) {
        // * comp2511 does not allow it
        // Integer result = 0;
        // for (var x : st) {
            //     result += x;
            // }
        // return result;

        Integer result = 0;
        Iterator<? extends Integer> iter = st.iterator();
        while (iter.hasNext()) {    // checks if the iterator is past-the-end
            result += iter.next();
        }
        return result;
    }

    /**
    * Pretty print a stack containing arbitrary elements, delimited by "," and enclosed by "[" and "]"
    *    [1, 2, 3]
    *  i ->
    */
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

        Stack<Integer> s2 = new Stack<>();
        s2.push(2);
        s2.push(2);
        s2.push(2);

        System.out.println(Stack.sumStack(s2));
    }

}