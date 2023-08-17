package com.orgd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Ranjith\\Selenium\\SelenimFirst\\Reference\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/search?q=ubtan+face+pack+uses&sxsrf=AB5stBhDcGAdB12Xd0Spx7ZxiIkRjyF4-w%3A1689858444840&source=hp&ei=jDG5ZIyhMKjn2roPhrSF6As&iflsig=AD69kcEAAAAAZLk_nPeSKi89UZv59eG3t5M1MfJ1aIOx&oq=&gs_lp=Egdnd3Mtd2l6IgAqAggCMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnSOwsUABYAHABeACQAQCYAQCgAQCqAQC4AQPIAQCoAgo&sclient=gws-wiz");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement essentials = driver.findElement(By.xpath("//h3[text()='Benefits of using ubtan face pack | Meesho']"));
		
				js.executeScript("arguments[0].scrollIntoView(false)", essentials);
		Thread.sleep(4000);
				driver.quit();

		
		
	}
}