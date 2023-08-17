package com.orgd;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	private static final int String = 0;
	private static final int Set = 0;
	private static final int List = 0;
	public static WebDriver driver;
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "F:\\Ranjith\\Selenium\\SelenimFirst\\Reference\\chromedriver.exe");
		driver.manage().window().maximize();
	}
	public static void loadUrl(String url) {
		driver.get(url);
		
		
	}
	public static void currentUrl(String currentUrl) {
		driver.getCurrentUrl();
		
	}
	public static void pageSource() {
		driver.getPageSource();
		
	}
public static void title() {
	driver.getTitle();
	
    }

public static void forward() {
	driver.navigate().forward();
	
}
public static void back() {
	driver.navigate().back();
	
}
public static void refresh() {
	driver.navigate().refresh();
	
}
public static void quitting() {
	driver.quit();
	
}
public static void closingAllTabs() {
	driver.close();
	
}
public static void switching() {
	driver.switchTo();
	
}
public static void equalOrNot() {
	driver.equals(driver);
	
}
public static WebElement findById (String id) {
	WebElement element=driver.findElement(By.id(id));
	return element;
	
}


	public static WebElement findByClass (String className) {
		WebElement element=driver.findElement(By.className(className));
		return element;
	
}
	public static WebElement findByCssSelector (String css) {
		WebElement element=driver.findElement(By.cssSelector(css));
		return element;
	
}
	public static WebElement findByXpath (String xpath) {
		WebElement element=driver.findElement(By.cssSelector(xpath));
		return element;
	
}


	

	public static WebElement findByTagName (String tagName) {
		WebElement element=driver.findElement(By.cssSelector(tagName));
		return element;
	
}

	public static WebElement findByLinkText (String LinkText ) {
		WebElement element=driver.findElement(By.linkText(LinkText));
		return element;
	
}
	public static WebElement findByPartialLinkText (String PartialLinkText ) {
		WebElement element=driver.findElement(By.linkText(PartialLinkText));
		return element;
	
}

	public static WebElement findByname (String name ) {
		WebElement element=driver.findElement(By.name(name));
		return element; 
	
}
	public static void rightClick() {
		Actions a = new Actions(driver);
		a.contextClick().build().perform();
		
	}
	
	public static void doublelick () {
		Actions a = new Actions(driver);
		a.doubleClick().build().perform();
		
	}

	



}

