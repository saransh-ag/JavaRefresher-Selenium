/**
 * @author saragarw
 * Passing parameters thru object in test
 */
package com.Annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Param {
	@Test(dataProvider = "getdata1")
    public void testcase1(String cn,String cp){
        //selenium code to login in to application
        System.out.println(cn + " password is " + cp);
    }
    
    @DataProvider
    public Object[][] getdata1(){
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
