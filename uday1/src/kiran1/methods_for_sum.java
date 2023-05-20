package kiran1;
import java.util.Scanner;

public class methods_for_sum {

	public static void main(String[] args) {
		methods_for_sum g=new methods_for_sum();
		Scanner f=new Scanner(System.in);
		System.out.print("enter a:");
		int a=f.nextInt();
		System.out.print("enter b:");
		int b=f.nextInt();
		
		
		int s=g.sum(a,b);
		int r=s+10;
		System.out.println(r);
		f.close();

	}
	public int sum(int a,int b) {
		int z=a+b;
		return z;
	}

}
