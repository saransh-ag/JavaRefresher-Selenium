package com.CollectionAPIs;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Bangalore is 20 kms far from ecity";
        System.out.println(str.length());
        System.out.println(str.equals("bangalore is 20 kms far from ecity"));
        System.out.println(str.equalsIgnoreCase("bangalore is 20 kms far from ecity"));
        System.out.println(str.contains("ess"));
        System.out.println(str.isEmpty());
	}

}
