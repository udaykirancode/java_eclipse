package kiran1;
import java.util.Scanner;
public class prime_number {
	public static void main(String[] Args) {
		prime_number k=new prime_number();
		Scanner r=new Scanner(System.in);
		System.out.print("enter n:");
		int n=r.nextInt();
		
		int j=k.prime_num(n);
		if (j==1){
			System.out.print("not prime number");
			
		}
		else {
			System.out.print("prime number");
		}
		r.close();
	}
	public  int prime_num(int n) {
		int flag=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=1;
				break;
				
			}
			else {
				flag=0;
			}
		}
		return flag;
		
	}

}
