package com.app.test;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Failed_Test2 {
	
	@Test()
	public void test1() {
		String s = "Aiite";
		Assert.assertTrue(s.contains("a"));
	}
	
	@Test()
	public void test2() {
		String s = "Aiite";
		Assert.assertTrue(s.contains("A"));
	}

}
