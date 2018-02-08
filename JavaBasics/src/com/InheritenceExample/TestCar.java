package com.InheritenceExample;

public class TestCar {

	public static void main(String[] args) {
		
		Car c = new Car(); //parent class
		c.start();
		c.stop();
		
		BMW b = new BMW(); //child class
		b.start();
		b.stop();
		b.theftSafety();
		
		Car d = new BMW(); // parent reference
		d.start();
		d.stop();

	}

}
