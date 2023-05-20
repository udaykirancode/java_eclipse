package Interfaces;

public interface Inter1 {
	public void get();
	public void out();
	default void read() {
		System.out.println("read the input");
	}
	static void readout() {
		System.out.println("read out");
	}

}
