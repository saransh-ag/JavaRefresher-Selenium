package com.Annotations;

import org.testng.annotations.Test;

public class FetchDataFromDataPool {
	@Test(dataProviderClass=DataPool.class,dataProvider="getdata1")
    public void testcase1(String cn,String cp){
        //selenium code to login in to application
        System.out.println(cn+" password is "+cp);
    }
}
