package com.app.junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Validate {
	
	//Assert Class validation
	// assertequals(),asserttrue(),assertfalse()
	@Ignore
	@Test
	public void test1() {
		String s1 = "Aiite";
		String s2 = "aiite";
		Assert.assertEquals(s1, s2);
		System.out.println("Fail");
	}
	
	@Test
	public void test2() {
		String s1 = "Aiite";
		Assert.assertTrue(s1.contains("A"));
		System.out.println("True");
	}
	
	@Test
	public void test3() {
		String s1 = "Aiite";
		Assert.assertFalse(s1.contains("a"));
		System.out.println("True");
	}

}
