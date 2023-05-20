package w3prac;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Take_Date {
	public static void main(String[] args) throws ParseException {
		try {
		Scanner s=new Scanner(System.in);
		String date=s.nextLine();
		s.close();
		SimpleDateFormat d=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(d.parse(date));
		}
		catch(Exception e) {
			System.out.println("enter valid date");
		}
		
		
	}

}
