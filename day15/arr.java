package days200;

public class arr {
    public static void main(String args[]) {
        
        int a[] = new int[10];  
       
        for (int i = 0; i < 9; i++) {
            a[i] = i + 1;
            System.out.println("Original array: " + a[i]);
        }

      
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }

      
        System.out.println("Reversed array:");
        for (int i : a) {
            System.out.println(i);
        }
    }
}
