/**
 * rule 1: constructor shouldn't have return datatype
 * rule 2: constructor shouldn't be static
 * method overloading
 */

package com.constructorExample;

public class Car {
	
	//default constructor
	public Car() {
		System.out.println("This is a Constructor");
	}

	//parameterized constructor- String
	public Car(String model) {
		System.out.println("model of the car is " + model);
	}
	//parameterized constructor- int
	public Car(int price) {
		System.out.println("price of the car is " + price);
	}
	//parameterized constructor- String, int
	public Car(String model, int price) {
		System.out.println("model of the car is " + model + 
				" and its price is " + price);
	}
	public static void main(String[] args) {
		new Car();
		new Car("BMW");
		new Car(20000);
		new Car("BMW",20000);

	}

}
