package kiran1;
import java.util.Arrays;
import java.util.Scanner;
public class string_pro {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String j;
		System.out.print("enter a string:");
		j=s.nextLine();
		//
//		System.out.println(j.charAt(4));
//		System.out.println(j.codePointAt(4));
//		System.out.println(j.codePointBefore(5));
//		System.out.println(j.codePointCount(0,4));
		
		String h;
		char []a=j.toCharArray();
		System.out.println(a);
		String g=Arrays.toString(j.split(""));
		System.out.println(g);
		h=String.copyValueOf(a,1,6);
		System.out.print(h);
		s.close();
//		System.out.print("enter a string :");
//		h=s.nextLine();
//		System.out.println(j.contentEquals(cs));
//		System.out.println(h.contentEquals(cs));
//		int res=j.compareTo(h);
//		int res=j.compareToIgnoreCase(h);
//		if(res<0) {
//			System.out.print("strin       g 1 < string 2");
//		}
//		else if(res==0) {
//			System.out.print("string1=string 2");
//			
//		}
//		else {
//			System.out.print("string>string2");
//			
//		}
//		System.out.println(j+h);
	}
	

}
