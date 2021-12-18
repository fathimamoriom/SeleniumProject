package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		//enter the wordbook
		
		//XSSFWorkbook wb = new XSSFWorkbook("./data1/ExcelSheet.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx");
		
		//get sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		//get row
		XSSFRow row = sheet.getRow(2);
		
		//get column
		XSSFCell cell = row.getCell(1);
		
		//// Actions -> Read value
		//String sValue = cell.getStringCellValue();
		
		String Value = cell.getStringCellValue();
		System.out.println(Value);
		
		
		
		
		
		

	}

}
