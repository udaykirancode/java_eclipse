package inheritance;
import java .util.Scanner;
public class inher extends addition {
	static	int a;
	static	int b;
	{
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		s.close();
	}

	public static void main(String[] args) {
		inher l=new inher();
		//System.out.println("uday");
		//inher n=new inher();
//		addition m=new addition();
//		addition n=new addition();
		
		int d=additin(a,b);
		System.out.println(d);
		l.read();

	}
	public void read() {
//		Scanner s=new Scanner(System.in);
//		int a=s.nextInt();
//		int b=s.nextInt();
		int d=super.additin(a,b);
		System.out.println(d);
	}
	public static int additin(int a, int b) {
		return a-b;
	}
		

}
