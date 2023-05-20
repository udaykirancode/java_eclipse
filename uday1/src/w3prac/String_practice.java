package w3prac;

public class String_practice {
	public static void main(String[] args) {
		String s1="udaY Kiran";
		String s2="udaY Kiran";
		int i=s1.charAt(1);
		int j=s1.charAt(2);
		System.out.println(i);
		System.out.println(j);
		int k=s1.charAt(2);
		//System.out.println(k);
//		//int l=100;
//		for(i=1;i<=1000;i++) {
//			System.out.println(i+":"+(char)i);
//			
//			
//		}
		//System.out.println(s.codePointCount(0,s.length()));
		System.out.println(s1.codePointAt(1));
		System.out.println(s1.codePointAt(2));
		for(i=0;i<=s1.length()-1;i++) {
			if(65<s1.codePointAt(i) & s1.codePointAt(i)<65+25) {
				System.out.println(s1.charAt(i));
			}
			
			
		}
		System.out.println(s1.contains(" daY"));
		System.out.println(s1.contentEquals(s2));  
	        StringBuffer sb=new StringBuffer(s2); 
	        sb.append(s1);  
	        System.out.println(sb);  
		
	}

}
