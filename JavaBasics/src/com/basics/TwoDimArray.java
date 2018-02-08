package com.basics;

public class TwoDimArray {

	public static void main(String[] args) {
		Object obj[][] = new Object [3][2];
		
		obj[0][0] = "Name1";
		obj[0][1] = "Password1";
		
		obj[1][0] = "Name2";
		obj[1][1] = "Password2";
		
		obj[2][0] = "Name3";
		obj[2][1] = "Password3";

		System.out.println("row count = " + obj.length);
		System.out.println("column Count = " + obj[0].length);

		for (int i=0;i<obj.length; i++) {
			for (int j=0; j<obj[0].length; j++) {
				System.out.println(obj[i][j]);
			}
		}
			
	}

}
