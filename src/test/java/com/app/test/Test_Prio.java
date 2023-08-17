package com.app.test;

import org.testng.annotations.Test;

public class Test_Prio {
	
	@Test(priority=1)
	public void username() {
		System.out.println("username");
	}
	
	@Test(priority=2)
	public void password() {
		System.out.println("password");
	}
	
	@Test(priority=3)
	public void click() {
		System.out.println("click");
	}

}
