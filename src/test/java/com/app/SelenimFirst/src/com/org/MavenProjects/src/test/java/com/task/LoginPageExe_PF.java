package com.task;

import com.mavn.BaseClass1;

public class LoginPageExe_PF extends PaymentLocator_PF_Exe {
	public static void user() {
		BaseClass1.inputValues(new LoginPageLocators_PF().getUsername(), value);
		
	}
public static void pass() {
	BaseClass1.inputValues(new LoginPageLocators_PF().getPassword(), value);
}
public static void login() {
	BaseClass1.clickValue(new LoginPageLocators_PF().getLogin());
	
}
}
