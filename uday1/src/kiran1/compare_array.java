package kiran1;
import java.util.Scanner;
public class compare_array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int A[][]=new int [3][3];
		int B[][]=new int [3][3];
		System.out.println("Enter matrix A");
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<B[i].length;j++) {
				System.out.print("enter element at"+i+j+":");
				A[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter matrix B");
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<B[i].length;j++) {
				System.out.print("enter element at"+i+j+":");
				B[i][j]=s.nextInt();
			}
		}
		s.close();
		//Comparet(A,B);
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[i].length;j++) {
				for(int k=0;k<B.length;k++) {
					for(int n=0;n<B[k].length;n++) {
						if(A[i][j]==B[k][n]) {
							System.out.print(B[k][n]+" ");
						}
					}
				}
			}
		}
		
		

	}
//	public static void Comparet(int A[][],int B[][]) {
//		for(int a[]:A) {
//			for(int b:a) {
//				for(int c[]:B) {
//					for(int d:c) {
//						if(A[b]==B[d]) {
//							System.out.print(A[b]);
//						}
//					}
//				}
//				
//			}
//		}
//		
//	}

}
