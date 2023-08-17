package com.app.test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	public WebDriver driver = null;
	@Parameters({"browser"})
	@Test
	public void test1(String data) {
		if(data.equals("chrome")) {
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
		}if(data.equals("edge")) {
			driver= new EdgeDriver();
			driver.get("https://www.google.com");
		}
	}

}
