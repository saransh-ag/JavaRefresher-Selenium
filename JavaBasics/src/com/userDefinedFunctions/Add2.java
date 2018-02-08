package com.userDefinedFunctions;

public class Add2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("A");
		//add_two(a,b);
		int c = add_two(a,b) + 50;
		System.out.println("Total = " + c);
		System.out.println("B");
	}

	private static int add_two(int x, int y) {
		int z = x + y;
		//System.out.println("Sum = " + z);
		return z;
	}

}
