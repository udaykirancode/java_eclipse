package Interfaces;

public interface Maths_op {
	
	
	public void add();
	public void sub();
	public void mul();
	public void div();
	default void mod() {
		System.out.println("default maethod");
		
	}
	static void avg() {
		System.out.println("uday");
		
	}

}
