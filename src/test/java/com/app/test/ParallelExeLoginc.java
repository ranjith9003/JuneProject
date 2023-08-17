package com.app.test;

public class ParallelExeLoginc {
	// main method single thread 
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.start();
		b.start();
	}
}

class A extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test1");
	}
}

class B extends Thread{
	// Thread  run functionality start()
	public void run() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test2");
	}
}