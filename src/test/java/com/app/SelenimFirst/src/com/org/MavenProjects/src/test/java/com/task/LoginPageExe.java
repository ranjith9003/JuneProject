package com.task;

import org.openqa.selenium.WebElement;

import com.mavn.BaseClass1;

public class LoginPageExe extends LoginPage_Locator {
public static void user() {
	BaseClass1.inputValues(LoginPage_Locator.username(),value);
	
}
public static void pass() {
	BaseClass1.inputValues(LoginPage_Locator.password(),value );
	
}
public static WebElement  login( WebElement login) {
	BaseClass1.clickValue(LoginPage_Locator.login());
	return login;
	
}
}
