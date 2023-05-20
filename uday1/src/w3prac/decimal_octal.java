package w3prac;
import java.util.Scanner;
public interface decimal_octal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
		System.out.print("enter dec number:");
		int dec=s.nextInt();
		dec_oct(dec);
		s.close();
		}
		catch(Exception e) {
			System.out.println("enyter intege");
		}

	}
	public static void dec_oct(int dec) {
		int i=0;
		int o[]=new int[900];
		while(dec!=0) {
			o[i++]=dec%8;
			dec/=8;
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(o[j]);
		}
		
		
	}


}
