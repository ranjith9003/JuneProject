package com.mavn;

public class LoginPageExe extends LoginPageLocator {
	public static void user() {
		BaseClass1.inputValues(LoginPageLocator.username(),"Aiite" );
	}
	public static void pass() {
		BaseClass1.inputValues(LoginPageLocator.password(), "1234");
	}
	public static void loginButton() {
		BaseClass1.clickValue(LoginPageLocator.login());
		
	}

}
