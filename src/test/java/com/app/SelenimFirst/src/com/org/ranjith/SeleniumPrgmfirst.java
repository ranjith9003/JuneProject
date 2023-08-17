package com.org.ranjith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPrgmfirst {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Ranjith\\Selenium\\SelenimFirst\\Reference\\chromedriver.exe");
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN0G0&p=yahoo+games");
	String x =driver.getCurrentUrl();
	System.out.println(x);
	System.out.println(driver.getPageSource());
	System.out.println(driver.getTitle());
	driver.close();	
	}

}
