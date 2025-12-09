package days200;

public class arrayq {
// linear search

	public static void lin(int[] a,int n) {
		for(int i:a) {
			if (a[i]==n) {
			System.out.println(a[i]);	
			}
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9};
		lin(arr, 4);

	}

}
