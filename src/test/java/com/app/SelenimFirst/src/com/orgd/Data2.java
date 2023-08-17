package com.orgd;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data2 {
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "F:\\Ranjith\\Selenium\\SelenimFirst\\Reference\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/alerts");
			WebElement alert = driver.findElement(By.id("alertButton"));
			alert.click();
			Alert simple = driver.switchTo().alert();
			simple.accept();
			
			
			
	}

}
