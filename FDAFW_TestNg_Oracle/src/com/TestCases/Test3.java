package com.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.library.library;

public class Test3 extends library{

	@Test
	public void testcase3() throws Throwable {
		login();
		clickontask();
		clickonproandcustomer();
		clickoncreatenewcustomer();
		createcustomer("CustomerC", "DescriptionC", "cradio3");
		verifysucessmsg();
	}
}
