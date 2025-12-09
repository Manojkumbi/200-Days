package days200;

import java.util.ArrayDeque;

public class arrdq {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        // Methods:
        arrayDeque.offer("Apple"); // Adds an element at the end
        arrayDeque.offerFirst("Banana"); // Adds an element at the front
        arrayDeque.offerLast("Cherry"); // Adds an element at the end

        System.out.println("ArrayDeque: " + arrayDeque);

        System.out.println("Peek First: " + arrayDeque.peekFirst()); // Retrieves the first element
        System.out.println("Peek Last: " + arrayDeque.peekLast());   // Retrieves the last element

        arrayDeque.pollFirst(); // Removes the first element
        System.out.println("ArrayDeque after pollFirst: " + arrayDeque);

        arrayDeque.pollLast(); // Removes the last element
        System.out.println("ArrayDeque after pollLast: " + arrayDeque);
    }
}
