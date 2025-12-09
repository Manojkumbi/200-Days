package days200;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());  // This will throw NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        } catch (Exception e) {
            System.out.println("Caught Exception");
        }
    }
}
