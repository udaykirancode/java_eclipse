package kiran1;
import java.util.Scanner;
public class uday1 {
	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a:");
		a=s.nextInt();
		s.close();
		for(int i=1;i<=9;i++) {
			if(a%i==0) {
					System.out.println(i);			
			}
			else {
				System.out.println(i);
			}
		}	
	}
}