package days200;

public class throwd {

	static void temp(int a) {
		if (a<18) {
			String h="u should be at least 18";
			throw new ArithmeticException(h);
		}else {
			String h = "uare more than 18";
			throw new ArithmeticException(h);
		}
	}
	public static void main(String[] args) {
	 try {
         // Trigger the root exception
         throw new ArithmeticException("Root Cause");
     } catch (ArithmeticException e) {
         // Chain the exception
         throw new RuntimeException("Chained Exception", e);
     }
	 
	}

}
