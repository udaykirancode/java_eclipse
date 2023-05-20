package Interfaces;
import java.util.Scanner;
public class Integres_Op implements Maths_op {
	static int a;
	static int b;
	
	public static void main(String args[]) {
		Integres_Op d=new Integres_Op();
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		s.close();
		d.mod();
		Maths_op.avg();
	}
	@Override
	public void add() {
		System.out.println(a+b);
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println(a-b);
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println(a*b);
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println(a/b);
		
	}
	@Override
	public void mod() {
		System.out.println(a%b);
	}
	
}
