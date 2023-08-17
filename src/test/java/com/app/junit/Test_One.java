package com.app.junit;

import java.sql.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test_One {
	
	@BeforeClass
	public static void beforeclass() {
		System.out.println("beforeclass");
	}
	
	@Before
	public void before() {
		Date d = new Date(0);
		System.out.println("before");
		System.out.println(d);
		
	}
	@After
	public void after() {
		Date d = new Date(0);
		System.out.println("after");
		System.out.println(d);
		
	}
	@Test
	public void test1() {
		System.out.println("testone");
	}
	@Test
	public void test2() {
		System.out.println("testtwo");
	}
	
	@AfterClass
	public static void afterclass() {
		System.out.println("afterclass");
	}

}
