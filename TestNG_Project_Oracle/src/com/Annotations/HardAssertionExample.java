/**
 * Assertions
 * 	a. Hard assert (actual, expected)
 * 	Drawback: works with try- catch block (trespass)
 */
package com.Annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionExample {

	@Test
	public void testcase() {
		int Explinks = 10;
		int Actlinks = 12;	//Selenium code
		System.out.println("A");
		
		try {
			Assert.assertEquals(Actlinks, Explinks);
		} 
		catch (Throwable t) {
			System.out.println("B");
		}
	}
}