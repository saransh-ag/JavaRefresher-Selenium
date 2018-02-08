package com.basics;

public class Car {
	String model;
	int price;
	int wheels;
	
	public static void main(String[] args) {
		
		Car a = new Car();	//instance of class 'Car'
		Car b = new Car();
		Car c = new Car();
		
		a.model = "BMW";
		a.price = 20000;
		a.wheels = 4;
		
		System.out.println("Model of the car is:" + a.model);
		System.out.println("Price of car is:" + a.price);
		System.out.println("Number of wheels:" + a.wheels);
		
	}

}
