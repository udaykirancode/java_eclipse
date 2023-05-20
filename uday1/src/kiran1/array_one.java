package kiran1;
import java.util.Scanner;

public class array_one {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("enter size:");
		int n=s.nextInt();
		
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		s.close();
		
//		for(int i=0;;) {
//			if(i<a.length) {
//				System.out.print("enter element at index:"+i);
//				a[i]=s.nextInt();
//				i++;
////			}
//			
//	
//		}
		for(int va:a) {
			System.out.print(va);
		}

		
		
	}

}
