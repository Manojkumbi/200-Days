package days200;

import java.util.PriorityQueue;

public class preq {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Methods:
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(5);

        System.out.println("PriorityQueue: " + priorityQueue);

        System.out.println("Peek: " + priorityQueue.peek()); // Retrieves, but does not remove, the highest-priority element
        System.out.println("Poll: " + priorityQueue.poll()); // Retrieves and removes the highest-priority element

        System.out.println("PriorityQueue after poll: " + priorityQueue);
    }
}
