package com.mavn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPageLocator extends BaseClass1 {
	public static WebElement username() {
		return driver.findElement(By.id("email"));
	}
	public static WebElement password() {
		return driver.findElement(By.id("pass"));
		
	}
	public static WebElement login() {
		return driver.findElement(By.id("u_0_5_JF"));
		
	}

}
