package days200;

import java.util.HashSet;
import java.util.Set;

public class set1 {
    public static void main(String[] args) {
        // Creating a HashSet of String type
        Set<String> set = new HashSet<>();

        // 1. Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        
        // Attempting to add a duplicate element
        set.add("Apple"); // Duplicate will not be added
        System.out.println("HashSet after adding elements: " + set);

        // 2. Checking if an element exists using contains()
        boolean hasBanana = set.contains("Banana");
        System.out.println("Does the set contain Banana? " + hasBanana);

        // 3. Removing an element using remove()
        set.remove("Date");
        System.out.println("HashSet after removing 'Date': " + set);

        // 4. Checking the size of the HashSet
        int size = set.size();
        System.out.println("Size of the HashSet: " + size);

        // 5. Iterating through the HashSet
        System.out.println("Elements in HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // 6. Clearing the HashSet
        set.clear();
        System.out.println("HashSet after clearing: " + set);
    }
}
