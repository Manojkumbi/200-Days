package days200;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sorted {
    public static void main(String[] args) {
        // Create a SortedSet using TreeSet
        SortedSet<String> fruits = new TreeSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println("Original SortedSet: " + fruits);

        // Method: first()
        String firstFruit = fruits.first();
        System.out.println("First element: " + firstFruit);

        // Method: last()
        String lastFruit = fruits.last();
        System.out.println("Last element: " + lastFruit);

        // Method: headSet(E toElement)
        SortedSet<String> headSet = fruits.headSet("Cherry");
        System.out.println("HeadSet (less than 'Cherry'): " + headSet);

        // Method: tailSet(E fromElement)
        SortedSet<String> tailSet = fruits.tailSet("Banana");
        System.out.println("TailSet (greater than or equal to 'Banana'): " + tailSet);

        // Method: subSet(E fromElement, E toElement)
        SortedSet<String> subSet = fruits.subSet("Apple", "Date");
        System.out.println("SubSet (from 'Apple' to 'Date'): " + subSet);

        // Method: comparator()
        System.out.println("Comparator: " + fruits.comparator()); // null means natural ordering

        // Method: add(E e) and remove(Object o)
        fruits.add("Elderberry");
        System.out.println("After adding 'Elderberry': " + fruits);

        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        // Checking if a specific element exists
        System.out.println("Contains 'Apple': " + fruits.contains("Apple"));
        System.out.println("Contains 'Banana': " + fruits.contains("Banana"));

        // Size of the SortedSet
        System.out.println("Size of the SortedSet: " + fruits.size());

        // Iterating over the SortedSet
        System.out.print("Iterating over SortedSet: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
    }
}
