package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.LoginPage_Locator;

public class LoginPage_Exe extends LoginPage_Locator {
	
	public static void user() {
		BaseClass.inputValue(LoginPage_Locator.username(), "Aiite");
		
	}
	
	public static void pass() {
		BaseClass.inputValue(LoginPage_Locator.password(), "Data");
	}

	public static void loginbutton() {
		BaseClass.clickValue(LoginPage_Locator.login());
	}
}
