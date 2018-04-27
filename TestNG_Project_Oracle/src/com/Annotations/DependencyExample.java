/**
 * @author saragarw
 * Methods for dependencies among tests
 */
package com.Annotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependencyExample {
	
	@Test (priority = 1)
	public void login() {
		SoftAssert st = new SoftAssert();
		st.assertTrue(true);
		//TODO Selenium code for 'Login' goes here
		System.out.println("Login");
		st.assertAll();
	}
	@Test (priority = 3, dependsOnMethods = {"login"})
	public void composeMail() {
		SoftAssert st = new SoftAssert();
		st.assertTrue(false);
		//TODO Selenium code for 'Compose Mail' goes here
		System.out.println("compose Mail");
		st.assertAll();

	}
	@Test (priority = 2, dependsOnMethods = {"login", "composeMail"})
	public void saveMail() {
		//TODO Selenium code to 'save mail' goes here
		System.out.println("Save Mail");
	}
}
