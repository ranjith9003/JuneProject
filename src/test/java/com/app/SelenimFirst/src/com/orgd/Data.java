package com.orgd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Ranjith\\Selenium\\SelenimFirst\\Reference\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4b3e4wrxds_b&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=617721280315&hvpos=&hvnetw=g&hvrand=4380182753314555613&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061892&hvtargid=kwd-311187680635&hydadcr=5841_2362028");
	  WebElement typing =driver.findElement(By.id("twotabsearchtextbox"));
	 typing.sendKeys("Mobiles");
	WebElement search =driver.findElement(By.id("nav-search-submit-button"));
	 search.click();
	}

}
