package com.orgd;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data4 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Ranjith\\Selenium\\SelenimFirst\\Reference\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		TakesScreenshot tc = (TakesScreenshot) driver;
		File source = tc.getScreenshotAs(OutputType.FILE);
		File myFile = new File("C:\\\\Users\\\\HP\\\\Desktop\\\\ranjith\\\\img1.png");
		org.openqa.selenium.io.FileHandler.copy(source, myFile);
		driver.quit();
	

	}
}