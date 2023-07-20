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
     * @ precondition: the stack is not empty.
     */
    public E peek() {
        return stack.get(stack.size() - 1);
    }

    /**
     * Removes the top element of the stack, and returns that element.
     * @precondition The stack is not empty.
     */
    public E pop() {
        return stack.remove(stack.size() - 1);
    }

    /**
     * Returns the stack as an ArrayList
     */
    public ArrayList<E> toArrayList() {
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

    public static Integer sumStack(Stack<? extends Integer> st) {
        Integer res = 0;
        for (Integer element : st) {
            res += element;
        }
        return res;
    }

    // 1, 2, 3, 4, 5
    // [ 1, 2, 3, 4, 5 ]
    public static void prettyPrint(Stack<?> st) {
        System.out.print("[ ");
        Iterator<?> iterator = st.iterator();
        for (int i = 0; i < st.size(); i ++) {
            System.out.println(iterator.next() + ", ");
        }
        System.out.print(" ]");
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