public class hjhj {
    public static void main(String[] args) {
        
        // 1. Data Types and Variables
        int myInt = 10;         // Integer data type
        double myDouble = 5.5;   // Floating-point data type
        char myChar = 'A';       // Character data type
        boolean myBool = true;   // Boolean data type
        String myString = "Hello, Java!"; // String (reference data type)

        // 2. Array
        int[] numbers = {1, 2, 3, 4, 5};  // Array of integers

        // 3. Operators
        int sum = myInt + numbers[0];     // Arithmetic operator
        myInt++;                          // Increment operator
        boolean isGreater = myDouble > 3; // Comparison operator

        // 4. Control Statements
        if (isGreater) {
            System.out.println(myDouble + " is greater than 3");
        } else {
            System.out.println(myDouble + " is not greater than 3");
        }

        // For loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // While loop
        int count = 0;
        while (count < 3) {
            System.out.println("Count is: " + count);
            count++;
        }

        // Switch case
        switch (myChar) {
            case 'A':
                System.out.println("You selected A");
                break;
            case 'B':
                System.out.println("You selected B");
                break;
            default:
                System.out.println("Invalid selection");
        }
    }
}
