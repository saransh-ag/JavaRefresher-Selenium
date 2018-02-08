package com.basics;

public class MultiDataTypeArray {

	public static void main(String[] args) {
		Object obj[] = new Object[4];
		
		obj[0] = "Bangalore";
		obj[1] = 23;
		obj[2] = 34.44;
		obj[3] = true;
		//System.out.println(obj.length);

		/* for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		} */
		
		//for- each loop
		for (Object x:obj) {
			System.out.println(x);
		}
	}

}
