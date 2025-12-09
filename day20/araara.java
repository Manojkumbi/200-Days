package days200;

//in range
public class araara {
    public static void search(int[] arr, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2};
        int target = 1;
        int start = 0;
        int end = arr.length - 1;
        search(arr, target, start, end);
    }
}
