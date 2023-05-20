package w3prac;

public class string_buffer {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("uday kiran");
		StringBuffer s1=new StringBuffer("uday kiran");
		System.out.println(s.equals(s1));
		String s2=new String("uday");
		String s3=new String("uday");
		String s4="uday";
		String s5="uday";
		System.out.println(s==(s1));
		System.out.println(s4==(s5));
		char []k=new char[] {'a','b'};
		String s9=String.copyValueOf(k);
		System.out.println(s9);
	}

}
