package CodesDope;

public class Car implements Service{

	public static void main(String[] args) {
		Car c=new Car();
		c.GetService();
		System.out.println(c.GetService());

	}

	public int GetService() {
		System.out.println("car service");
		return 2;
	}

}
