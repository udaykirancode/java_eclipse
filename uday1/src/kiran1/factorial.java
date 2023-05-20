package kiran1;
import java.util.Scanner;
public class factorial {
	public static void main(String[] args) {
		factorial u=new factorial();
		Scanner n=new Scanner(System.in);
		System.out.print("enter n:");
		int j=n.nextInt();
		int z=u.fac(j);
		System.out.print("factorial of "+j+" is "+z);
		n.close();
	}
	public int fac(int n) {
		int fa=1;
		for(int i=1;i<=n;i++) {
			fa*=i;
		}
		return fa;
	}
}