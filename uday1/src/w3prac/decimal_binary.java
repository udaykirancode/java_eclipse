package w3prac;
import java.util.Scanner;
public interface decimal_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter a decimal number:");
		int dec=s.nextInt();
		dec_bin(dec);
		s.close();

	}
	public static void dec_bin(int dec) {
	int i=0;int []d=new int[90];
		while(dec!=0) {
			d[i++]=dec%2;
			dec/=2;
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(d[j]);
		}
	}

}
