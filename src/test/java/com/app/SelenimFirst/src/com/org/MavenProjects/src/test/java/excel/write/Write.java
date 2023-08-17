package excel.write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
	public static void excelWrite() {
	
		try {
			File file = new File("F:\\Ranjith\\Selenium\\MavenProjects\\src\\main\\resources\\TestData\\data2.xlsx");
			FileInputStream fis = new FileInputStream(file);
			try {
				Workbook wb = new XSSFWorkbook(fis);
			 Sheet createSheet = wb.createSheet("hai");
			Row createRow = createSheet.createRow(0);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue("hello");
			FileOutputStream fos= new FileOutputStream(file);
			wb.write(fos);
			wb.close();
			
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
	excelWrite();
}
}
