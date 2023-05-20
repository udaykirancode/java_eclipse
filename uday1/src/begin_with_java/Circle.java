package begin_with_java;
/**
 Question 2

Circle Class
Create a class to represent a Circle type in java, which should have following :
radius. Instance field of type double
No-argument constructor. Set radius with default value of 1.0
Constructor. that accept an argument for radius
getRadius. public method that returns the radius of Circle
getArea. Method that returns the area of Circle
 */
public class Circle {
	private double radius;
	Circle(){
		radius=1.0;
		
	}
	Circle(double radius){
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	double getArea() {
		return radius*radius*3.14;
	}

	public static void main(String[] args) {
		

	}

}
