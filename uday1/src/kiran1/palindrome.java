package kiran1;
import java.util.Scanner;

public class palindrome {
	public static void main(String[] Args) {
		Scanner x=new Scanner(System.in);
		System.out.print("enter n:");
		int n=x.nextInt();
		palindrome t=new palindrome();
		if(n==t.palindrome_check(n)) {
			System.out.print("enterd number is palindrome");
			
			
		}
		else {
			System.out.print("enterd number is not palindrome");
		}
		x.close();
		
	}
	public int palindrome_check(int n) {
		int r;
		int s=0;
		while(n>0) {
			r=n%10;
			s=s*10+r;
			n/=10;
			
		}

		return s;
	}
	

}
