package com.task;

public class Exe extends LoginPageExe_PF {

	public static void main(String[] args) {

		browserLaunch("https://adactinhotelapp.com/index.php");
		user();
		pass();
		login();
		excelRead(0, 0);
		address();

	}
}