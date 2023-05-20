package Date_Time;
//import java.util.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.text.ParseException;
import java.util.Scanner;
import java.time.*;
public class Date_Object {

	public static void main(String[] args) throws ParseException{
//		int year=2002;
//		int m=11;
//		int d=14;
		Scanner s=new Scanner(System.in);
		System.out.print("enter 1st date:");
		String date=s.nextLine();
//		String n[]=date.split("/");
//		int y=Integer.parseInt(n[2]);
//		int m=Integer.parseInt(n[1]);
//		int d=Integer.parseInt(n[0]);
//		System.out.print("enter 2st date:");
//		String date2=s.nextLine();
//		String n2[]=date2.split("/");
//		int y2=Integer.parseInt(n2[2]);
//		int m2=Integer.parseInt(n2[1]);
//		int d2=Integer.parseInt(n2[0]);
//		s.close();
//		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.YEAR,y);
//		cal.set(Calendar.MONTH, m);
//		cal.set(Calendar.DATE,d);
		SimpleDateFormat dd=new SimpleDateFormat("dd/MM/yyyy");
		
		//dd.parse(date2);
//		LocalDate d1= LocalDate.of(y,m,d);
//		LocalDate dd2=LocalDate.of(y2,m2,d2);
//		Period diff=Period.between(d1,dd2);
//		System.out.println(diff.getDays());
//		System.out.println(diff.getMonths());
//		
//		System.out.println(diff.getYears());
		System.out.println(dd.parse(date));


	}

}
