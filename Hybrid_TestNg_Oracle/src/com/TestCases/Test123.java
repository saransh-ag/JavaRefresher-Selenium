/**
 * Data Driven Framework
 * Gets data from excel sheet and execute test cases
 */
package com.TestCases;

import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.library.library;
import xls.ShineXlsReader;

public class Test123 extends library {

	@BeforeClass
    public void bmethod(){
        if((ht.get("Test123")==null) || (!ht.get("Test123").equalsIgnoreCase("yes"))){
            throw new SkipException("This testcase is not set for execution");
        }
    }
	@Test(dataProvider="getdata")
	public void testcase123(String cname, String cdesc, String cradio) throws Throwable {
		login();
        clickontask();
        clickonproandcustomer();
        clickoncreatenewcustomer();
        createcustomer(cname,cdesc,cradio);
        verifysucessmsg();
	}
	@DataProvider
    public Object[][] getdata(){
        ShineXlsReader xls=new ShineXlsReader(".\\src\\com\\excelFiles\\DataPool.xlsx");
        int rcount = xls.getRowCount("Test1");
        int ccount = xls.getColumnCount("Test1");
        Object obj[][]=new Object[rcount-1][ccount];
        for( int i=2;i<=rcount;i++){
            for( int j=0;j<ccount;j++){
                obj[i-2][j]=xls.getCellData("Test1", j, i);
            }
        }
        return obj;
	}
}
