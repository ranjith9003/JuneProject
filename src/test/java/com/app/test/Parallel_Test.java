package com.app.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parallel_Test {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}

}
