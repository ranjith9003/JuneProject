package com.orgd;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Ranjith\\Selenium\\SelenimFirst\\Reference\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.className("newclose")).click();
		driver.findElement(By.className("newclose2")).click();
		driver.findElement(By.xpath("//span[text()='Login']")).click();
Set<String> login = driver.getWindowHandles();
List<String> li= new ArrayList<>(login);
System.out.println(li);
driver.switchTo().window(li.get(1));
System.out.println(driver.getCurrentUrl());
}
}