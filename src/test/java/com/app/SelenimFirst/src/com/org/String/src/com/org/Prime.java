package com.org;

public class Prime {
	public static void main(String[] args) {
	int n=9;
	int count = 0;
	for(int i=1;i<=10;i++) {
		if(n%i==0) {
			count++;
			break;
		}
	}
		if(count==2) {
			System.out.println("prime");
		}
	}
}
