package com.basicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitExample{
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
		//go to gmail sign in page
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");	//Open URL
		driver.manage().window().maximize();		//maximize browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver,10);
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(20, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS);
		
		//enter wrong email id
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("akdfiijjiieieie");
		
		//click next
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]"))));		//print error msg
		
		//print error msg
		String text = driver.findElement(By.xpath(".//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]")).getText();
		System.out.println("text= " + text);
	}
}
