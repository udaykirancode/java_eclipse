package kiran1;
import java.util.Scanner;

public class Check_Email {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter a mail id:");
		String email=s.nextLine();
		s.close();
		boolean b1=email.contains(" ");
		
		if(b1==false && (email.endsWith("@gmail.com")||email.endsWith("@yahoo.com"))) {
			System.out.println("valid email");
			
		}
		else {
			System.out.println("not a valid email");
		}
		
	}

}
