package com.test.utility;

import java.util.ArrayList;



public class UtilDemo {
	static String sheetPath = "E:/Automation/ExploreProject/Excels/RegData.xlsx";
	static String sheetName = "RegData";
	static TestDataUtil excelUtil = new TestDataUtil(sheetPath, sheetName);
	
	/*@Test(priority=1)
	public void readRowCount(){
		excelUtil.getRowCount();
	}
	
	@Test(priority=2);
	public void getCellData(int rowNum, int colNum){
		excelUtil.getCellData(rowNum, colNum);
	} */
	
	public static ArrayList<Object[]> getDataFromExcel(){
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		int rowCount = excelUtil.getRowCount();
		int colNum = 0;
		for (int rowNum=1; rowNum<=rowCount; rowNum++){
				String firstName = excelUtil.getCellData(rowNum, colNum);
				colNum++;
				String lastName = excelUtil.getCellData(rowNum, colNum);
				colNum++;
				String userName = excelUtil.getCellData(rowNum, colNum);
				colNum++;
				String password = excelUtil.getCellData(rowNum, colNum);
				colNum =0;
				Object ob[] = {firstName, lastName, userName, password};
				myData.add(ob);
		}
		return myData;
		
		
	}
	
	
	
	
}
