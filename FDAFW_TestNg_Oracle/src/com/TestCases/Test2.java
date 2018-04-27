package com.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.library.library;

public class Test2 extends library{

	@Test
	public void testcase2() throws Throwable {
		login();
		clickontask();
		clickonproandcustomer();
		clickoncreatenewcustomer();
		createcustomer("CustomerB", "DescriptionB", "cradio2");
		verifysucessmsg();
	}
}
