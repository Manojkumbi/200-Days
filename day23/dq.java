package days200;

import java.util.Deque;
import java.util.LinkedList;

public class dq {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        // Methods:
        deque.addFirst("Apple"); // Adds an element at the front
        deque.addLast("Banana"); // Adds an element at the back
        deque.add("Cherry");     // Adds an element at the end

        System.out.println("Deque: " + deque);

        System.out.println("First Element: " + deque.getFirst()); // Retrieves the first element
        System.out.println("Last Element: " + deque.getLast());   // Retrieves the last element

        deque.removeFirst(); // Removes the first element
        System.out.println("Deque after removeFirst: " + deque);

        deque.removeLast(); // Removes the last element
        System.out.println("Deque after removeLast: " + deque);
    }
}
