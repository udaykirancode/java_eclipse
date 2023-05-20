package begin_with_java;

public class perfet_square {

	public static void main(String[] args) {
		double a=4;
//		double s=Math.sqrt(a);
//		System.out.println(Math.sqrt(a));
//		System.out.println(Math.floor(a));
		for(double i=1;i*i<=a;i++) {
			if((a%i==0) &&(a/i==i) ) {
				System.out.println("perfect number "+i);
			}
			else {
				System.out.println("not square");
		}
		}
	}
}
	

