package GreatLearning;

public class Vehicle {
	int cost;
	int milage;
	public Vehicle(int c, int m){
		cost=c;
		milage=m;
	}
	public void ShowDetails() {
		System.out.println("iam a vehicle");
		System.out.println("cost of vehicle is"+cost);
		System.out.println("milage of vehicle is"+milage +" per km");
	}

}
