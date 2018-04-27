/**
 * Uses ASCII values for test case execution order
 * priority works in least value first (-2, -1, 0, 1, 2, ...)
 */
package com.Annotations;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Priority {
	
	@Test (priority = 1)
	public void login() {
		//TODO Selenium code for 'Login' goes here
		System.out.println("Login");
	}
	@Test (priority = 2, enabled=true) //change to false if you want to not execute this
	public void composeMail() {
		//TODO Selenium code for 'Compose Mail' goes here
		System.out.println("compose Mail");
		throw new SkipException("Skipping this test case");
	}
	@Test (priority = 3)
	public void saveMail() {
		//TODO Selenium code to 'save mail' goes here
		System.out.println("Save Mail");
	}
}
