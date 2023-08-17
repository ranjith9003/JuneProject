package com.mav;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.checkerframework.common.value.qual.StaticallyExecutable;

public  class excel_Read {
		
	public static void read() {
		
 try {
	 File f= new File("F:\\Ranjith\\Selenium\\MavenProjects\\src\\main\\resources\\TestData\\Data.xlsx");
	FileInputStream fis=new FileInputStream(f)	;
	Workbook wb =new XSSFWorkbook(fis);
	 Sheet sheet = wb.getSheet("Sheet1");
	 Row row = sheet.getRow(1);
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

}
