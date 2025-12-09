package days200;


public class VarargsExample {

	public static void sum(int... numbers) {
     int total = 0;
     for (int num : numbers) {
         total += num;
     }
     System.out.println("Sum of numbers: " + total);
 }

 public static void main(String[] args) {
     sum(1, 2, 3, 4);    // multiple arguments
     sum(5, 10);          //  fewer arguments
     sum();               //  no arguments
 }
}
