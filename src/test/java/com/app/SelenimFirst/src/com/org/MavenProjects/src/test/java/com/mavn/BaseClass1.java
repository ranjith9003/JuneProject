package com.mavn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class BaseClass1 {

	public static WebDriver driver = null;
	public static String fis;
	public static String number;
	public static String value;
	public static String f;
		
	

	public static void browserLaunch(String url) {
		System.setProperty("webdriver.chrome.driver","F:\\Ranjith\\Selenium\\SelenimFirst\\Reference\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}

	public static void inputValues(WebElement element, String Data) {
		element.sendKeys(Data);
	}

	public static void clickValue(WebElement element) {
		element.click();
	}
	public static void select_Value_dropdown(WebElement element,String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}

	public static String excelRead(int a, int b) {

		try {
			File f = new File("F:\\Ranjith\\Selenium\\MavenProjects\\src\\main\\resources\\TestData\\DataTest3.xlsx");			
			FileInputStream fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.getSheet(number);
		Row row = sheet.getRow(a);
		Cell cell = row.getCell(b);
		int cellType = cell.getCellType();
		
		if (cellType == 1) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		
		}
		else if(cellType == 0) {
			if(DateUtil.isCellDateFormatted(cell)) {
			 Date dateCellValue = cell.getDateCellValue();	
SimpleDateFormat sm=new SimpleDateFormat("dd/mm/yyyy");
			String dateValue = sm.format(dateCellValue);
			System.out.println(dateValue);
			}
			else {
				double num = cell.getNumericCellValue();
				long l= (long) num;
				String stringValueOf = String.valueOf(l);
				System.out.println(stringValueOf);
			
			}
			
		}
		return value;
	}
	
 
		
	}



