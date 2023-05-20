package Date_Time;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class Take_Date {
	public static void main(String args[]) throws ParseException {
		Scanner s=new Scanner(System.in);
		System.out.print("enter date in DD-MM-YYYY:");
		String date=s.nextLine();
		SimpleDateFormat d=new SimpleDateFormat("dd-MM-yyyy");
		d.parse(date);
		System.out.println();
		s.close();
		
	}

}
