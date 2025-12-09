package days200;

public class test {

	public static void main(String[] args) {
		int a=10;
		int b= 20;
		int c=0;
		
		try {
			try {
				int res = a/c;
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
			int[] z= {1,2,3};
			System.out.println(z[4]);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
