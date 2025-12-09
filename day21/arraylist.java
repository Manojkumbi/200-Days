package days200;

import java.util.*;

public class arraylist {
  public static void main(String[] args) {

	  List<String> fruits = new ArrayList<>();

        // 1. Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Initial ArrayList: " + fruits);

        // 2. Accessing elements from the ArrayList using get()
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // 3. Modifying an element using set()
        fruits.set(1, "Strawberry");
        System.out.println("ArrayList after update: " + fruits);

        // 4. Removing an element using remove()
        fruits.remove(3); // Removing the element at index 3
        System.out.println("ArrayList after removing Mango: " + fruits);

        // 5. Checking if an element exists using contains()
        boolean hasApple = fruits.contains("Apple");
        System.out.println("Does the list contain Apple? " + hasApple);

        // 6. Checking the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of ArrayList: " + size);

        // 7. Iterating through the ArrayList
        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 8. Clearing the ArrayList
        fruits.clear();
        System.out.println("ArrayList after clearing: " + fruits);
    }
}
