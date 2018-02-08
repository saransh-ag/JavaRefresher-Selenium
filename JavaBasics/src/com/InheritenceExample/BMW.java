package com.InheritenceExample;

public class BMW extends Car {
	
	public BMW() {
		System.out.println("We are in BMW constructor");
	
	}
	public void start() {
		System.out.println("BMW starts");
	}
	public void stop() {
		System.out.println("BMW stops");
	}
	public void theftSafety() {
		System.out.println("BMW is stolen!!");
	}
}
