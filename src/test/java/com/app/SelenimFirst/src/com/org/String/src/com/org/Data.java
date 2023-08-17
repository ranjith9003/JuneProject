package com.org;

public class Data {
	public static void main(String[] args) {
		String a= "Deepak kumar";
		String rev ="";
	//	String []b= a.split("");
		for (int i = a.length()-1; i>=0; i--) {
			char ch =a.charAt(i);
			rev = rev+ch;
			
			
		}
		System.out.println(rev);
		}
				}
	


