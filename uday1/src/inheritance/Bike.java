package inheritance;

public class Bike extends Vehicle {
	public static void main(String[] args) {
		System.out.println(speed());
		Bike b =new Bike();
		b.Break();
	}
	public void Break() {
		System.out.println("uday kioran");	
	}
}