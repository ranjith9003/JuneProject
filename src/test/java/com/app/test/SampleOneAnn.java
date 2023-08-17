package com.app.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleOneAnn {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("BeforeSUite");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("afterSUite");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1");
	}
}
