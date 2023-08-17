package com.app.excel;

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
import org.openqa.selenium.By;

import com.app.base.BaseClass;

public class ExcelRead  extends BaseClass{
	
	public static void excel_Read() {
		try {
			File f = new File("C:\\Users\\Yuvaraj\\eclipse-workspace\\Test_July\\src\\test"
					+ "\\resources\\TestData\\Test_July_2.xlsx");
			FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(2);
		System.out.println(cell);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void excel_Read_AllData() {
		try {
			File f = new File("C:\\Users\\Yuvaraj\\eclipse-workspace\\Test_July\\src\\test"
					+ "\\resources\\TestData\\Test_July_2.xlsx");
			FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheet.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
			}	
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void excel_reuse_Data(int a , int b) {
		try {
			File f = new File("C:\\Users\\Yuvaraj\\eclipse-workspace\\Test_July\\src\\test"
					+ "\\resources\\TestData\\Test_July_2.xlsx");
			FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(a);
		Cell cell = row.getCell(b);
		int cellType = cell.getCellType();
		if(cellType==1) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
		else if(cellType==0) {
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
				String datevalue = sm.format(dateCellValue);
				System.out.println(datevalue);	
			}else {
				double num = cell.getNumericCellValue();
				long l = (long)num;
				String valueOf = String.valueOf(l);
				System.out.println(valueOf);
			}
			
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static String excel_reuseable(int a , int b) {
		String value = null;
		try {
			File f = new File("C:\\Users\\Yuvaraj\\eclipse-workspace\\Test_July\\src\\test"
					+ "\\resources\\TestData\\Test_July_2.xlsx");
			FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(a);
		Cell cell = row.getCell(b);
		int cellType = cell.getCellType();
		if(cellType==1) {
			value= cell.getStringCellValue();
			System.out.println(value);
		}
		else if(cellType==0) {
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
				value = sm.format(dateCellValue);
				System.out.println(value);	
			}else {
				double num = cell.getNumericCellValue();
				long l = (long)num;
				value= String.valueOf(l);
				System.out.println(value);
			}
			
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		
		
	}
	
	public static void main(String[] args) {
	//	browserlaunch("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(excel_reuseable(1,2));
		
	}

}
