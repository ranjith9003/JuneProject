package file.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AllDataReusable {
	public static String reusableData(int a, int b) {
		String value = null;
		try {
			File f = new File("F:\\Ranjith\\Selenium\\MavenProjects\\src\\main\\resources\\TestData\\data2.xlsx");
			InputStream fis = new FileInputStream(f);
			try {
				Workbook wb = new XSSFWorkbook(fis);
				Sheet sheet = wb.getSheet("Sheet1");
				Row row = sheet.getRow(a);
				Cell cell = row.getCell(b);
				System.out.println(cell);
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
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}
	public static void main(String[] args) {
		reusableData(0,0 );
	}
}
