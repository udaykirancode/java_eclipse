package GreatLearning;

public class Car extends Vehicle{
	String color;
	int tyres;
	Car(int c, int m, String co, int ty){
		super(c,m);
		color=co;
		tyres=ty;
		
	}
	public void ShowCar() {
		System.out.println("i am a car");
		System.out.println("car color is "+color);
		System.out.println("car tyres are"+tyres);
	}

}
