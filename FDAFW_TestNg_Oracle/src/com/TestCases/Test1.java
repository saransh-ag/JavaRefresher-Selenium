package com.TestCases;

import org.testng.annotations.Test;
import com.library.library;

public class Test1 extends library{

	@Test
	public void testcase1() throws Throwable {
		login();
		clickontask();
		clickonproandcustomer();
		clickoncreatenewcustomer();
		createcustomer("CustomerA", "DescriptionA", "cradio1");
		verifysucessmsg();
	}
}
