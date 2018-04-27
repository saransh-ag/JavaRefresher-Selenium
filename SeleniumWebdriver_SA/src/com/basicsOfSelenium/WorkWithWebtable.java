/**
 * Program to take all values in a web table from rediff money.
 * https://money.rediff.com/gainers
 */
package com.basicsOfSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkWithWebtable {

	public WebDriver driver;
	public String Browser = "chrome";
	@Test
	public void testcase1() throws Throwable {
		
		SoftAssert st=new SoftAssert();
		if (Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver(); 	//Opens Chrome browser
		}
		else if (Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
			driver = new FirefoxDriver();	//Opens Firefox browser
		}
		else if (Browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver(); 	//Opens IE browser
		}
		
		driver.get("https://money.rediff.com/gainers?src=top_nav");	//Open URL
		driver.manage().window().maximize();		//maximize browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List <WebElement> li = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td"));
		for (int i=0;i<li.size();i++) {
			System.out.println(li.get(i).getText());
		}
	}
}
