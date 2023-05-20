package kiran1;
import java.util.Scanner;

public class fibonaci_method {
	public static void main(String[] args) {
		System.out.print("enter n:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.print("0 1");
		fib(n);
		s.close();
		
	}
	public static void fib(int n) {
		int n1=0;
		int n2=1;
		for(int i=2;i<=n-1;i++) {
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			
			System.out.print(" "+n3);
			
			
		}
		
	}

}
