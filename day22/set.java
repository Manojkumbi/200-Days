package days200;

import java.util.LinkedHashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        // Creating a LinkedHashSet of String type
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // 1. Adding elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Date");
        
        // Attempting to add a duplicate element
        linkedHashSet.add("Apple"); // Duplicate will not be added
        System.out.println("LinkedHashSet after adding elements: " + linkedHashSet);

        // 2. Checking if an element exists using contains()
        boolean hasCherry = linkedHashSet.contains("Cherry");
        System.out.println("Does the set contain Cherry? " + hasCherry);

        // 3. Removing an element using remove()
        linkedHashSet.remove("Date");
        System.out.println("LinkedHashSet after removing 'Date': " + linkedHashSet);

        // 4. Checking the size of the LinkedHashSet
        int size = linkedHashSet.size();
        System.out.println("Size of the LinkedHashSet: " + size);

        // 5. Iterating through the LinkedHashSet
        System.out.println("Elements in LinkedHashSet:");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }

        // 6. Clearing the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("LinkedHashSet after clearing: " + linkedHashSet);
    }
}

