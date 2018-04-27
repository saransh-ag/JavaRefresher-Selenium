package com.basicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class UploadFileUsingSikuli {
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
		
		driver.get("http://www.timesjobs.com/candidate/register.html");	//Open URL
		driver.manage().window().maximize();		//maximize browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//click on browse button
		//driver.findElement(By.xpath("html/body/div[1]/div[1]/div/section/form/div[6]/div[7]/fieldset/div[1]")).click();
		 driver.findElement(By.xpath("//input[@name='resumeFile_basic']")).click();
		 
		//upload file
		 Pattern p1 = new Pattern("‪C:\\Users\\saragarw\\Desktop\\Sikuli\\f.png");
		 Pattern p2 = new Pattern("‪C:\\Users\\saragarw\\Desktop\\Sikuli\\o.png");
		 
		 Screen s = new Screen();
		 s.type(p1,"C:\\Users\\saragarw\\Desktop\\Sikuli\\sample.txt");
		 s.click(p2);
	}
}
