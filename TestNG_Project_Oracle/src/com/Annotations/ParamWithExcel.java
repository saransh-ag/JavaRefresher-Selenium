package com.Annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import xls.ShineXlsReader;

public class ParamWithExcel {

	@Test(dataProvider="getdata")
	public void testcase(String cn, String cp) {
		//Selenium code to login
		System.out.println(cn + "---" + cp);
	}
	@DataProvider
	public Object[][] getdata() {
		ShineXlsReader xls = new ShineXlsReader(".\\src\\com\\ExcelFiles\\TestData.xlsx");
		int rowCount = xls.getRowCount("Sheet1");
		int columnCount = xls.getColumnCount("Sheet1");
		Object obj[][] = new Object [rowCount-1][columnCount];
		for (int i=2; i<=rowCount; i++) {
			for (int j=0; j<columnCount; j++) {
				obj [i-2][j]= xls.getCellData("Sheet1", j, i);
			}
		}
		return obj;
	} 
	
}
