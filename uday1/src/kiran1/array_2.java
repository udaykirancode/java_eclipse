package kiran1;
import java.util.Scanner;

public class array_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[][]=new int[3][3];	
		
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=1;j++) {
				System.out.print("enter element at "+i+j+":");
				arr[i][j]=s.nextInt();
			}
		}
		s.close();
		for(int[]t:arr) {
			for(int n:t) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
		
//		for(int i=0;i<=2;i++) {
//			for(int j=0;j<=1;j++) {
//				System.out.print(arr[i][j]+" ");
//				
//			}
//			System.out.println();
//		}

	}

}
