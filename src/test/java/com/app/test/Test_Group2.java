package com.app.test;

import org.testng.annotations.Test;

public class Test_Group2 {

	/*@Test(groups= {"sanity","reg"})
	public void test4() {
		System.out.println("test4");
	}
	
	@Test(groups= {"smoke","reg"})
	public void test5() {
		System.out.println("test5");
	}
	
	
	@Test(groups= {"sanity","reg"})
	public void test6() {
		System.out.println("test6");
	}*/
	
	@Test(dependsOnMethods="test8")
	public void test7() {
		System.out.println("test7");
	}

	
	@Test
	public void test8() {
		System.out.println("test8");
	}

}
