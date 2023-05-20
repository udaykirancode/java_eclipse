package w3prac;
import java.util.Scanner;
import java.time.*;
public class Diffe_Date {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
		System.out.print("enter date1 in dd/mm/yy:");
		String date1=s.nextLine();
		System.out.print("enter date1 in dd/mm/yy:");
		String date2=s.nextLine();
		s.close();
		String d1[]=date1.split("/");
		String d2[]=date2.split("/");
		int dd1=Integer.parseInt(d1[0]);
		int mm1=Integer.parseInt(d1[1]);
		int yy1=Integer.parseInt(d1[2]);
		int dd2=Integer.parseInt(d2[0]);
		int mm2=Integer.parseInt(d2[1]);
		int yy2=Integer.parseInt(d2[2]);
		LocalDate DATE1=LocalDate.of(yy1,mm1,dd1);
		LocalDate DATE2=LocalDate.of(yy2,mm2,dd2);
		Period diff=Period.between(DATE1,DATE2);
		System.out.println("day="+diff.getDays());
		System.out.println("months="+diff.getMonths());
		System.out.println("years="+diff.getYears());
		}
		catch(Exception e) {
			System.out.println("Enter valid dates");
		}
		//Diffe_Date g=new Diffe_Date();
		
		
		
		

	}

}
