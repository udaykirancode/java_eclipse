package kiran1;
import java.util.Scanner;
public class no_char {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char n='0';
		int v=0;
		int u=0;
		int q=0;
		String h="";
		no_char y=new no_char();
		while(n!='*') {
			System.out.print("enter a character:");
			n=s.next().charAt(0);
			char z=Character.toLowerCase(n);
			if(y.isVowel(z)) {
				v=v+1;
				h=h+z;
				
				
			}
			else if(z<='z' && z>='a') {

				u=u+1;
				
			}
			else {
				q=q+1;
			}
		}
		System.out.println("vowels:"+v+h);
		System.out.println("consonants"+u);
		System.out.println("spl characters"+q);
		s.close();
	}
	public boolean isVowel(char c) {
		
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		default:
			return false;
			
		}
			
		
	}

}
