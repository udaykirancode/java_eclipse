package Interfaces;

import CodesDope.Service;

public class Bike implements Service {

	@Override
	public int GetService() {
		// TODO Auto-generated method stub
		System.out.println("bike service");
		return 5;
	}

}
