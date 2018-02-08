package com.userDefinedFunctions;

public class StaticExample {

	 String model;
	    int price;
	    static int wheels = 4;
	    
	    public  void test() {
	        System.out.println("Test for static");
	    }
	    
	    public static void main(String[] args) {
	        StaticExample s=new StaticExample();
	        
	        System.out.println("wheels=" + wheels);
	        s.test();
	    }
	
}
