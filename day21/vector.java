package days200;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        // Creating a Vector of Integer type
        Vector<Integer> vector = new Vector<>();

        // 1. Adding elements to the Vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        System.out.println("Initial Vector: " + vector);

        // 2. Accessing an element using get()
        int elementAtIndex1 = vector.get(1);
        System.out.println("Element at index 1: " + elementAtIndex1);

        // 3. Modifying an element using set()
        vector.set(2, 35);
        System.out.println("Vector after modification: " + vector);

        // 4. Removing an element using remove()
        vector.remove(3); // Removes the element at index 3
        System.out.println("Vector after removing element at index 3: " + vector);

        // 5. Checking if an element exists using contains()
        boolean hasTwenty = vector.contains(20);
        System.out.println("Does the Vector contain 20? " + hasTwenty);

        // 6. Checking the size and capacity of the Vector
        int size = vector.size();
        int capacity = vector.capacity();
        System.out.println("Size of the Vector: " + size);
        System.out.println("Capacity of the Vector: " + capacity);

        // 7. Iterating through the Vector
        System.out.println("Elements in Vector:");
        for (Integer num : vector) {
            System.out.println(num);
        }

        // 8. Clearing the Vector
        vector.clear();
        System.out.println("Vector after clearing: " + vector);
    }
}
