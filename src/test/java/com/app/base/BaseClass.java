package com.app.base;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver = null;
	
	@BeforeClass
	public static void browserlaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
	}
	
	public static void inputValue(WebElement element , String data) {
		element.sendKeys(data);
	}
	
	public static void clickValue(WebElement element) {
		element.click();
	}
	
	public static void select_Value_dropdown(WebElement element,String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}
	
}
