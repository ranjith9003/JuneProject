package com.orgd;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Data3 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Ranjith\\Selenium\\SelenimFirst\\Reference\\chromedriver.exe");
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	File firstSrc= driver.getScreenshotAs(OutputType.FILE);
	File dest= new File("C:\\Users\\HP\\Desktop\\ranjith\\img.png");
	FileHandler.copy(firstSrc, dest);
	driver.quit();
	}

}
