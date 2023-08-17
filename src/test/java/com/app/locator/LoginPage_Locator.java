package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.BaseClass;

public class LoginPage_Locator extends BaseClass {
	
	public static WebElement username() {
		return driver.findElement(By.id("username")); 	
	}
	
	public static WebElement password() {
		return driver.findElement(By.id("password")); 	
	}
	
	public static WebElement login() {
		return driver.findElement(By.id("login")); 	
	}

}
