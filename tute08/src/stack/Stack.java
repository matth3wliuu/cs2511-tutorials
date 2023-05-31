package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A Simple Stack.
 * @param <E>
 *
 */

public class Stack<E> implements Iterable<E> {

    private List<E> list = new ArrayList<E>();

    /**
     * Pushes an element onto the top of the stack.
     * @param element
     */
    public void push(E element) {
        this.list.add(element);
    }

    /**
     * Removes the top element of the stack, and returns that element.
     * @precondition The stack is not empty.
     */
    public E pop() {
        return this.list.remove(this.list.size() - 1);
    }

    /**
     * Returns the top element of the stack, without removing it.
     */
    public E peek() {
        return this.list.get(this.list.size() - 1);
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        List<E> copy = new ArrayList<E>(this.list);
        Collections.reverse(copy);
        return copy.iterator();
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return this.list.size();
    }

    /**
     * Returns the stack as an ArrayList
     */
    public ArrayList<E> toArrayList() {
        return new ArrayList<E>(this.list);
        // return (ArrayList<E>)(this.list);
    }

    public static Integer sumStack(Stack<? extends Integer> stack) {
        int res = 0;
        for (Integer item : stack) {
            res += item;
        }
        return res;
    }

    // 1 3 5 2
    // [ 1, 3, 5, 2 ]
    public static void prettyPrint(Stack<?> stack) {

        System.out.print("[");

        Iterator<?> iter = stack.iterator();
        for (int i = 0; i < stack.size() - 1; i++) {
            System.out.print(iter.next() + ", ");
        }

        System.out.print(iter.next() + ", ");

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