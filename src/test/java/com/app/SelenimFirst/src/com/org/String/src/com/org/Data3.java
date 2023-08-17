package com.org;

public class Data3 {
	public static void main(String[] args) {
		String a = "Deepak Kumar";
		String rev = "";
		
			
			for (int i= a.length()-1; i>=0; i--) {
				char ch = a.charAt(i);
				rev= rev+ch;
			}
			System.out.println(rev);
		}
	}


