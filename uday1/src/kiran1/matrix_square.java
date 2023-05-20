package kiran1;
import java.util.Scanner;
//import java.math.*;
public class matrix_square {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter no.rows:");
		int c=s.nextInt();
		System.out.print("enter no.of columns:");
		int d=s.nextInt();
		int [][]arr=new int [c][d];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("enter  value at "+i+j+":");
				arr[i][j]=s.nextInt();
			}
			
			
		}
		for(int[]v:arr) {
			for(int x:v) {
				//System.out.print(Math.pow(x, 2)+" ");
				System.out.print(x*x+" ");
			}
			System.out.println();
		}
		s.close();
		
		

	}

}
