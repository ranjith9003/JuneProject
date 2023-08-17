package com.app.test;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Failed_Test1 {
	
	@Test(retryAnalyzer=FailedRetry_Logic.class)
	public void test1() {
		String s = "Aiite";
		Assert.assertTrue(s.contains("a"));
	}
	
	@Test(invocationCount=100)
	public void test2() {
		String s = "Aiite";
		Assert.assertTrue(s.contains("A"));
	}

}
