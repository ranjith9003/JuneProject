package com.app.test;

import org.testng.annotations.Test;

public class Parallel_Method2 {

	@Test
	public void username() {
		System.out.println(Thread.currentThread().getId());
		for (int i = 0; i <=3; i++) {
			System.out.println("test1");
		}
		

	}
	
	@Test
	public void password() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test2");
	}
	
	@Test
	public void click() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test3");
	}
}
