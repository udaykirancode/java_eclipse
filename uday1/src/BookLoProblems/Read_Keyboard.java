package BookLoProblems;
import java.io.DataInputStream;
public class Read_Keyboard {
	

	public static void main(String[] args) {
		
		DataInputStream s= new DataInputStream(System.in);
		int i=0;
		float v=0f;
		try {
			
			
			System.out.print("enter float number:");
			v=Float.valueOf(s.readLine()).floatValue();
		}
		catch(Exception e) {
			System.out.println("enter valid numbers");
		}
		System.out.println("i="+v);
		

	}

}
