package kiran1;
import java.util.Scanner;
public class armstrong {
	void uday() {
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("enter n:");
		int n=sc.nextInt();
		int t=n;
		int v=t;
		int c=0;
		int r,s=0;
		while(n>0) {
			r=n%10;
			c=c+1;
			n/=10;	
		}
		sc.close();
		System.out.println(c);
		while(t>0) {
			r=t%10;
			t/=10;
			s+=Math.pow(r, c);
			//System.out.println(s);
			
		}
		/*
		 * System.out.println(t); System.out.println(s); System.out.println(v);
		 */
		if(s==v) {
			System.out.print("armstrong number");
		}
		else {
			System.out.print("not armstrong number");
		}
		
	}
}	
