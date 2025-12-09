package days200;

import java.util.*;

public class test {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Iterating over the list
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Horse");
        System.out.println();
        System.out.println("✅linked list");
        // Iterating over the list
        for (String animal : linkedList) {
            System.out.println(animal);
        }

        Vector<Integer> vector = new Vector<>();

        // Adding elements
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println();
        System.out.println("✅vector");
        // Iterating over the vector
        for (int num : vector) {
            System.out.println(num);
        }

        Stack<String> stack = new Stack<>();

        // Pushing elements
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println();
        System.out.println("✅stack");
        // Popping elements
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

}
