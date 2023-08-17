package com.app.test;

import org.testng.Assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateAssert {
	
	/*@Test
	public void test1() {
		// hard Assert
		String s = "Aiite";
		Assert.assertEquals(s, "Aiite");
		System.out.println("First Validation");
		Assert.assertEquals(s, "aiite");
		System.out.println("Second Validation");
		Assert.assertTrue(s.contains("A"));
		System.out.println("Third Validation");
	}*/
	@Test
	public void test2() {
		// soft Assert
		String s = "Aiite";
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(s, "Aiite");
		System.out.println("First Validation");
		sf.assertEquals(s, "aiite");
		System.out.println("Second Validation");
		sf.assertTrue(s.contains("A"));
		System.out.println("Third Validation");
		sf.assertAll();
	}
	
	
	
}
