package com.basicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class WorkWithGoibibo {

	public WebDriver driver;
	public String Browser = "chrome";
	@Test
	public void testcase1() throws Throwable {
		
		
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
		
		driver.get("https://www.goibibo.com/");	//Open URL
		driver.manage().window().maximize();		//maximize browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//click on signin
		driver.findElement(By.xpath(".//*[@id='get_sign_in']")).click();
		
		/* 
		 * switch to frame
		 * right click, inspect in firebug, copy html from  <iframe id>
		 */
		driver.switchTo().frame("authiframe");
		//enter mobile number
		driver.findElement(By.xpath(".//*[@id='authMobile']")).sendKeys("9999999999");
		//switch driver reference to main page
		driver.switchTo().defaultContent();
		//close frame
		driver.findElement(By.xpath(".//*[@id='authOverlay']/div/a")).click();
	}
	
}
