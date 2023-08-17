package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mavn.BaseClass1;

public class LoginPage_Locator extends BaseClass1 {
	
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
