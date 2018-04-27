/**
 * @author saragarw
 * Read data from xls
 * Absolute path -> Real path
 * Relative path -> In root dir (Use \\ instead of \)
 * NOTE: Row starts from 1, Col. starts from 0
 */
package com.Annotations;

import org.testng.annotations.Test;

import xls.ShineXlsReader;

public class WorkWithExcel {

	@Test
	public void workwithexcel () {
		
		ShineXlsReader xls = new ShineXlsReader (".\\src\\com\\ExcelFiles\\TestData.xlsx");
		int rowCount = xls.getRowCount("Sheet1");
		int columnCount = xls.getColumnCount("Sheet1");
		System.out.println("Row count = " + rowCount);
		System.out.println("Column count = " + columnCount);
		
		for (int i=2; i<=rowCount; i++) {
			for (int j=0; j<columnCount; j++) {
				String cellData= xls.getCellData("Sheet1", j, i);
				System.out.println(cellData);
			}
		}
	}
}
