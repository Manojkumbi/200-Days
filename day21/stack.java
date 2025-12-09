package days200;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

        // 1. Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Initial Stack: " + stack);

        // 2. Accessing the top element using peek() without removing it
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // 3. Popping elements from the stack (LIFO - Last In First Out)
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after popping: " + stack);

        // 4. Checking if the stack is empty using isEmpty()
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

      
        int position = stack.search(20);
        System.out.println("Position of 20 in stack: " + position);
   
	}

}
