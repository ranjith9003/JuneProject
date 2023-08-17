package com.org.ranjith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Ranjith\\Selenium\\SelenimFirst\\Reference\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String currentUrl= driver.getCurrentUrl();
		System.out.println(currentUrl);
		WebElement forgot =driver.findElement(By.linkText("Forgotten password?"));
		forgot.click();
		
		
		
		
	}

}
