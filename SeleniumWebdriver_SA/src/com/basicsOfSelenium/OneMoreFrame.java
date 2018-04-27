package com.basicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class OneMoreFrame {

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
		
		driver.get("http://jqueryui.com/selectable/");	//Open URL
		driver.manage().window().maximize();		//maximize browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		//switch driver ref to frame
		//driver.switchTo().frame("demo-frame");
		
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); 	//select iframe class
		driver.switchTo().frame(0);
		//click on item 4
		driver.findElement(By.xpath(".//*[@id='selectable']/li[4]")).click();
		
	}
	
}
