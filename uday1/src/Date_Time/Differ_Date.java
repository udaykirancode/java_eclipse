package Date_Time;
import java.util.*;
import java.time.*;

public class Differ_Date {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//try {
		System.out.print("enter 1st date in dd-mm-yy:");
		String date1=s.nextLine();
		System.out.print("enter 2nd date in dd-mm-yy:");
		String date2=s.nextLine();
		String[] d1=date1.split("-");
		String[] d2=date2.split("-");
		int d11=Integer.parseInt(d1[0]);
		int d12=Integer.parseInt(d1[1]);
		int d13=Integer.parseInt(d1[2]);
		int d21=Integer.parseInt(d2[0]);
		int d22=Integer.parseInt(d2[1]);
		int d23=Integer.parseInt(d2[2]);
		LocalDate DATE1=LocalDate.of(d13,d12,d11);	
		LocalDate DATE2=LocalDate.of(d23,d22,d21);
		Period diff =Period.between(DATE1, DATE2);
		System.out.println(diff.getDays());
		System.out.println(diff.getMonths());
		System.out.println(diff.getYears());
		//}
//		catch(Exception e) {
//			System.out.println("enter valid dates");
//		}
	}

}
