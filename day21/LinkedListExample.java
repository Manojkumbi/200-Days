package days200;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList of String type
        LinkedList<String> animals = new LinkedList<>();

        // 1. Adding elements to the LinkedList
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cow");

        System.out.println("Initial LinkedList: " + animals);

        // 2. Adding an element at a specific position
        animals.add(2, "Sheep");
        System.out.println("After adding Sheep at index 2: " + animals);

        // 3. Accessing elements using get()
        String firstAnimal = animals.get(0);
        System.out.println("First animal: " + firstAnimal);

        // 4. Removing an element
        animals.remove("Horse");
        System.out.println("After removing Horse: " + animals);

        // 5. Checking if an element exists using contains()
        boolean hasCow = animals.contains("Cow");
        System.out.println("Does the list contain Cow? " + hasCow);

        // 6. Getting the size of the LinkedList
        int size = animals.size();
        System.out.println("Size of LinkedList: " + size);

        // 7. Iterating through the LinkedList
        System.out.println("Animals in the LinkedList:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        // 8. Adding elements to the front and end (like a deque)
        animals.addFirst("Lion");
        animals.addLast("Elephant");
        System.out.println("After adding Lion and Elephant: " + animals);

        // 9. Removing the first and last elements
        animals.removeFirst();
        animals.removeLast();
        System.out.println("After removing first and last elements: " + animals);
    }
}
