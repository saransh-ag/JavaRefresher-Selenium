/**
 * Exception is error in code, which does not allow program to execute
 * Uncaught exception can be handled only by try- catch block 
 */
package com.exceptionHandling;

public class UncaughtExceptionEx {

	public static void main(String[] args) {
		System.out.println("A");
		try {
			System.out.println(8/0);
			// System.out.println(8/4);
			System.out.println("We are in try block");
		} catch (Throwable t) {
			System.out.println(t.getMessage());
			System.out.println("We are in catch block");
		}
		System.out.println("B");
	}

}
