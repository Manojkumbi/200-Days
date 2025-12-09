package days200;

//minimum number

public class oraora {
    public static int search(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2};
        int result = search(arr);
        System.out.println("Minimum number: " + result);
    }
}
