package days200;

public class UncaughtExcep {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
//        int result = a / b;  // This will throw ArithmeticException
//        System.out.println(result);
        
        try {
			int result=a/b;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
    }
}
