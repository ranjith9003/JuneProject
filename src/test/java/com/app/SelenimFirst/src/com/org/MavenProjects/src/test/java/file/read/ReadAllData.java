package file.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllData {
	public static void readData() {
	
  try {
	  File	f = new File("F:\\Ranjith\\Selenium\\MavenProjects\\src\\main\\resources\\TestData\\Data.xlsx");
	   FileInputStream fis;
	   fis = new FileInputStream(f);
	   try {
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
	int PhysicalNumberOfRows =sheet.getPhysicalNumberOfRows();
	for (int i = 0; i < PhysicalNumberOfRows; i++) {
		Row row = sheet.getRow(i);
		int PhysicalNumberOfCells= row.getPhysicalNumberOfCells();
		for (int j = 0; j < PhysicalNumberOfCells; j++) {
			Cell cell = row.getCell(j);
			System.out.println(cell);
			
		}
	}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
    
    
	}
	public static void main(String[] args) {
		readData();
	}
}
   
