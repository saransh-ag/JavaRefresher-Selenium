/**
 * @author saragarw
 * Soft Assert: Even though there is a mismatch, it works!
 * No statement beyond assertAll(); will be executed.
 * Better use when executing multiple assertions
 */
package com.Annotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

	@Test
	public void testcase() {
		
		SoftAssert st = new SoftAssert();
		int Explinks = 10;
		int Actlinks = 12;	//Selenium code
		System.out.println("A");
		
		st.assertEquals(Actlinks, Explinks, "Comparing number of links");
		st.assertEquals(2, 3, "Comparing number of radiobuttons");
		System.out.println("b");
		
		st.assertAll();
		System.out.println("C");
		
	}
		
}
