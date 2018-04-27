package com.basicsOfSelenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MouseOverExample {

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
		
		driver.get("https://www.drikpanchang.com/");	//Open URL
		driver.manage().window().maximize();		//maximize browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//move to panchang 
		/*
		WebElement pan= driver.findElement(By.xpath(".//ul[@id='dpMenuId']/li[2]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(pan).build().perform();
		*/
		
		WebElement ved = driver.findElement(By.xpath(".//*[@id='dpPgIntrctv']/div[1]/div[2]/div[3]/div[8]/div[22]/div[1]/img"));
		Actions action = new Actions(driver);
		// action.moveToElement(ved).build().perform();
		action.contextClick(ved).build().perform();
		
		//create a Robot 🤖  to perform ops. It takes key strokes.
		Robot r=new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        
        /*action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        */
	}
}
