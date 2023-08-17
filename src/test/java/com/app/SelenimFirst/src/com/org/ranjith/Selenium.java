package com.org.ranjith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\Ranjith\\Selenium\\SelenimFirst\\Reference\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement userName= driver.findElement (By.id("email"));
	userName.sendKeys("ranjith");
	WebElement login = driver.findElement(By.name("pass"));
	login.sendKeys("12344");
	WebElement login1 = driver.findElement(By.tagName("button"));
	login1.click();
	
	}
}
