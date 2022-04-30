package com.actiTime.OrgTest;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups = "smokeTest")
	public void orgTest() {
		System.out.println("organization- SMOKE TEST");
	}
	
	@Test(groups = "regressionTest")
	public void orgConTest() {
		System.out.println("organization- REGRESSION TEST");
	}

}
