package com.basicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class testManualXpath2 {

	public WebDriver driver;
	public String Browser = "chrome";
	@Test
	public void testcase1() {
		
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
		
		driver.get("https://www.opencart.com/");	//Open URL
		driver.manage().window().maximize();		//maximize browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Login
		driver.findElement(By.xpath("//div[@id='navbar-collapse-header']/ul/li[1]")).click();
		driver.findElement(By.xpath("//div[@id='navbar-collapse-header']/ul/li[2]")).click();
		driver.findElement(By.xpath("//div[@id='navbar-collapse-header']/ul/li[3]")).click();
		driver.findElement(By.xpath("//div[@id='navbar-collapse-header']/ul/li[6]/ul/li[4]/a")).click();
	}
	
	
}
