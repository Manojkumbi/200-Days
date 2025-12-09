package days200;

public class StaticFinal {
	static int staticVar = 10; 
    final int finalVar = 20;

    // Static method
    static void staticMethod() {
        System.out.println("Static variable: " + staticVar);
    }
    
	public static void main(String[] args) {
		StaticFinal s=new StaticFinal();
		staticMethod();
		
		System.out.println("final variable: "+ s.finalVar);
	}

}
