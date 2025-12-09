package days200;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Methods:
        queue.add("Apple"); // Adds an element to the queue
        queue.add("Banana");
        queue.add("Cherry");

        System.out.println("Queue: " + queue);

        System.out.println("Peek: " + queue.peek()); // Retrieves, but does not remove, the head of the queue
        System.out.println("Poll: " + queue.poll()); // Retrieves and removes the head of the queue

        System.out.println("Queue after poll: " + queue);
        System.out.println("Is queue empty? " + queue.isEmpty()); // Checks if the queue is empty
    }
}
