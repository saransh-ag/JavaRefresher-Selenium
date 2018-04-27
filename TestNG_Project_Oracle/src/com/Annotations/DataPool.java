package com.Annotations;

import org.testng.annotations.DataProvider;

import xls.ShineXlsReader;

public class DataPool {

	@DataProvider
	public Object[][] getdata1() {
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
	
	@DataProvider
	public Object[][] getdata2(){
        Object obj[][] = new Object[3][2];
    
        obj[0][0] = "Name1";
        obj[0][1] = "Password1";
        
        obj[1][0] = "Name2";
        obj[1][1] = "Password2";
        
        obj[2][0] = "Name3";
        obj[2][1] = "Password3";
        
        return obj;
    }
}
