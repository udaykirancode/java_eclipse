package w3prac;
import java.util.Scanner;
public class Strings {

	public static void main(String[] args) {
		Integer i=new Integer(88);
		int j=i.intValue();
		String s="77";
		int l=Integer.parseInt(s);
		System.out.println(l);
		String o="14/11/2002";
		String m=new String("uday");
		StringBuffer str=new StringBuffer(m);
		System.out.println(str);
		//unicode
		System.out.println(o.codePointAt(0));
		System.out.println(o.codePointBefore(1));
		System.out.println(m.codePointCount(0,m.length()));
		int res=o.compareTo(m);
		System.out.println(res);
		int result=o.compareToIgnoreCase(m);
		
		System.out.println(result);
		//contains
		System.out.println(o.contains(m));
		System.out.println(o.contentEquals(m));
		
		//char array elements to string
		char[]u=new char[] {'1','2','3','5'};
		String f=String.copyValueOf(u,0,u.length);
		System.out.println(f);
		//endswiths
		System.out.println(o.endsWith("s"));
		//equals

		System.out.println(m.equals(o));
		System.out.println(m.equalsIgnoreCase(o));
		//array
		String n[]=o.split("/");
		int z=Integer.parseInt(n[2]);
		System.out.println(z);
	}

}
