/**
 * @author saragarw
 * Positive and Negative tests
 */
package com.Annotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OneMoreAssertion {

	@Test
	public void testcase() {
		SoftAssert st = new SoftAssert();
		boolean window_exist = true; //Selenium: isDisplayed();
		System.out.println("A");
		
		st.assertTrue(window_exist);
		st.assertFalse(window_exist, "checking existence of window");
		System.out.println("B");
		
		st.assertAll();
	}
}
