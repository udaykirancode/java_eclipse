package w3prac;

public interface decimal_hexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 dec_hex(150);
	}
	public static void dec_hex(int dec) {
		String hexa="";
		char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(dec!=0) {
			int rem=dec%16;
			hexa=hex[rem]+hexa;
			dec/=16;
		}
		System.out.print(hexa);
	}

}
