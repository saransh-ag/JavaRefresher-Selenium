package com.Annotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FailMethod {

	@Test
	public void testcase() {
		SoftAssert st = new SoftAssert();
		String Expstr = "Bangalore";
		String Actstr = "Bengaluru";
		
		System.out.println("A");
		
		if(!Expstr.equals(Actstr)) {
			st.fail("Comparing two strings ["+ Expstr + "] and [" + Actstr + "]");
		}
		System.out.println("B");
		st.assertAll();
	}
}
