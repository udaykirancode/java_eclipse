package kiran1;
import java.util.Scanner;
public class jagged_array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char [][]arr=new char [3][];
		arr[0]=new char[6];
		arr[1]=new char[4];
		arr[2]=new char[2];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("enter value at "+i+j+":");
				arr[i][j]=s.next().charAt(0);
			}
		}
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		for(char[] f :arr) {
			for(char v:f) {
				System.out.print(v+" ");
			}
			System.out.println();
			
		}
		s.close();
		
		
	}

}
