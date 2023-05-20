package begin_with_java;

public class Constructors {
	private int x;
	private double y;
	public Constructors() {

		x=0;
		y=0;
		System.out.println("no parameters");
	}
	public Constructors(int a, double b) {
		x=a;
		y=b;
	}
	public void SetConstructors() {
		x=10;
		y=25.75;
		
	}
	/** it prints the x and y value by calling constructors with parameters and parameterless*/
	public void Print() {
		System.out.println("x="+x);
		System.out.println("y="+y);
		
	}
	public static void main(String args[]) {
		
		Constructors s=new Constructors(20,35.0);
//		Constructors y=new Constructors();
//		System.out.println(s.x);
//		System.out.println(s.y);
		
		s.Print();
//		y.Print();
		
	}

}
