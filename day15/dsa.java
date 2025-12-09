package days200;


public class dsa {
	
	public static void main(String args[]) {
		System.out.println("//exchangin value of 2 var");

		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
System.out.println("//		counting");
		
		int[] a1= {11,1,2,45,78,54,96,85,45,32,54,85,95,75,45,15,15,25,35};
		int c = 0;
		for(int i:a1) {
			if (i<50) {
				c++;
			}
		}
		System.out.println(c);
		
System.out.println("//		summation");
		int s=0;
		for(int i:a1) {
			s+=i;
		}
		System.out.println(s);
		
System.out.println("//		factorial\r\n"
		+ "");		int n=4;
		int f=1;
		while(n>=1) {
			f=f*n;
			n--;
		}System.out.println(f);
		
System.out.println("//		fibonacci");
		int q = 0;
		int w = 1;
		int m = 10;  
		 int next=0;
		System.out.print(q + "," + w + ",");

		for(int i=1;i<=m;i++) {
			next=q+w;
			q=w;
			w=next;
			System.out.print(next+",");
		}
		
System.out.println("\n//		reverse the integer");
		
		int r=12345;
		int re=0;
		int l=0;
		while(r!=0) {
			l=r%10;
			re=(re*10)+l;
			r=r/10;
		}System.out.println(re);
	}
}
