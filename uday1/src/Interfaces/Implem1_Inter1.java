package Interfaces;

public class Implem1_Inter1 implements Inter1 {
	public static void main(String [] args) {
		Implem1_Inter1 i=new Implem1_Inter1();
		Inter1.readout();
		i.get();
		i.out();
		i.read();
		
	}
	public void get() {
		System.out.println("implementstion1 of get()1");
	}

	
	public void out() {
		System.out.println("implementaion1 of out()");	
	}
	@Override
	public void read() {
	System.out.println("implmentation1 of raed()");	
	}

}
