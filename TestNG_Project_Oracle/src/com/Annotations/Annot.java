/**
 * Annotations for TestNG
 * Executes in order:	BeforeClass, [BeforeMethod, Test, AfterMethod], AfterClass
 */
package com.Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annot {
	@Test
	public void testcase1() {
		//TODO Selenium code goes here
		System.out.println("Compose mail");
	}

	@BeforeMethod
	public void bmethod() {
		System.out.println("OpenBrowser, URL, Login");
	}
	
	@BeforeClass
	public void bclass() {
		System.out.println("Start Server");
	}
	
	@AfterClass
	public void aclass() {
		System.out.println("Shutdown Server");
	}
	
	@AfterMethod
	public void amethod() {
		System.out.println("Logout, CloseBrowser");
	}
	@Test
	public void testcase2() {
		//TODO Selenium code goes here
		System.out.println("Save mail");
	}
	
	@Test
	public void testcase3() {
		//TODO Selenium code goes here
		System.out.println("Draft mail");
	}
}
