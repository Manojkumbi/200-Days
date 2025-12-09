class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 integers: " + calc.add(10, 20));        // Calls add(int, int)
        System.out.println("Sum of 3 integers: " + calc.add(10, 20, 30));    // Calls add(int, int, int)
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 6.5));       // Calls add(double, double)
    }
}
