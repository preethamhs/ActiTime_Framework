package com.actiTime.contactTest;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups = "smokeTest")
	public void contactTest() {
		System.out.println("contact- SMOKE TEST");
	}
	
	@Test(groups = "regressionTest")
	public void contactOrgTest() {
		System.out.println("contact- REGRESSION TEST");
	}
}
