package com.test.utility;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

//import com.testData.Xls_Reader;
public class TestDataUtil {

	//static Xls_Reader reader;
	//public static ArrayList<Object[]> getExcelData()

	//return myData;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	public TestDataUtil(String sheetPath, String sheetName){
		try {
			workbook = new XSSFWorkbook(sheetPath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

	
	public  int getRowCount(){
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No.of rows: "+ rowCount );
			return rowCount;
			
	}
	
	
	public  String getCellData(int rowNum, int colNum){
			//TO get cell data string
			
			String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);
			return cellData;
			//TO get cell data number
			//double cellDataNumValue = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println(cellDataNumValue);
	}

}
