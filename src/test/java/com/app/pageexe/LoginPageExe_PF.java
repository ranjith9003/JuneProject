package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.LoginPageLocators_PF;
import com.app.locator.SearchHotel_Locator_PF;

public class LoginPageExe_PF  extends SearchHotel_Locator_PF{
	
	public static void user() {
		BaseClass.inputValue(new LoginPageLocators_PF().getUsername(), "yuvarajsekar3");
	}
	
	public static void pass() {
		BaseClass.inputValue(new LoginPageLocators_PF().getPassword() , "5GRXUL");
	}
	public static void loginbutton() {
		BaseClass.clickValue(new LoginPageLocators_PF().getLogin());
	}

}
