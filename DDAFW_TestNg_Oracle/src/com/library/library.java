package com.library;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.TestBase.TestBase;

public class library extends TestBase{

	public static void login () {
		driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys("admin");
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys("manager");
		driver.findElement(By.xpath(prop.getProperty("loginnow"))).click();
	}
	public static void clickontask() {
		driver.findElement(By.xpath(prop.getProperty("task"))).click();
	}
	public static void clickonproandcustomer() {
		driver.findElement(By.xpath(prop.getProperty("gotoproandcustomer"))).click();

	}
	public static void clickoncreatenewcustomer() {
		driver.findElement(By.xpath(prop.getProperty("createnewcustomer"))).click();

	}
	public static void clickoncreatenewproject() {
		driver.findElement(By.xpath(prop.getProperty("createnewproject"))).click();
	}
	public static void createcustomer(String cname, String cdesc, String cradio) {
		driver.findElement(By.xpath(prop.getProperty("Entercustomer"))).sendKeys(cname);
		driver.findElement(By.xpath(prop.getProperty("EntercustomerDescripion"))).sendKeys(cname);
		driver.findElement(By.xpath(prop.getProperty(cradio))).click();
		driver.findElement(By.xpath(prop.getProperty("createcustomer"))).click();
	}

	public static void verifysucessmsg() throws Throwable {
		 try{
			 driver.findElement(By.xpath(prop.getProperty("successmsg"))).isDisplayed();
			 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(srcFile, new File(".\\src\\com\\Screenshots\\Test" + (tc = tc + 1) + "_Pass.png"));
			 //Logout
			 driver.findElement(By.xpath(prop.getProperty("logout"))).click();
			 } catch(Throwable t) {
				 st.fail("Sucess msg not Displayed...");
				 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 FileUtils.copyFile(srcFile, new File(".\\src\\com\\Screenshots\\Test" + (tc = tc + 1) + "_Fail.png"));
				
				 //Logout
				 driver.findElement(By.xpath(prop.getProperty("logout"))).click();
				 //click on cancel creation
				 driver.findElement(By.xpath(prop.getProperty("cancelcustomercreation"))).click();
				 st.assertAll();
				 }
		 }
}

