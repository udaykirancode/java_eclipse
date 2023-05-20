package w3prac;
import java.util.Scanner;
public interface conversion_dec extends decimal_binary,decimal_hexadecimal,decimal_octal{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a decimal number:");
		byte g=s.nextByte();
		
		//while(g!=0) {
			System.out.print("\n1.to binary\n2.to hexa\n3.to hexadecimal\nenter choice of conversion:");
			byte c=s.nextByte();
			switch(c) {
			case 1:
				decimal_binary.dec_bin(g);
				break;
			case 2:
				decimal_hexadecimal.dec_hex(g);
				break;
			case 3:
				decimal_octal.dec_oct(g);
				break;
			default:
				System.out.print("enter a correct choice");
			
			//}
		}
		s.close();

	}

}
