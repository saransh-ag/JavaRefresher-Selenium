package com.basicsOfSelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkWithTabsAndPopups {
	public static WebDriver driver;
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
		
		driver.get("https://www.naukri.com/");	//Open URL
		driver.manage().window().maximize();		//maximize browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String mainwid = driver.getWindowHandle();
		CloseUnwantedWindows(mainwid);
		//main window
        driver.switchTo().window(mainwid);
        //click on recruiters
                driver.findElement(By.xpath("html/body/div[2]/div/ul/li[2]/a/div")).click();
        Set<String> allids = driver.getWindowHandles();
        Iterator<String> it=allids.iterator();
        it.next();
        String t1 = it.next();
        driver.switchTo().window(t1);
        //Enter tester
        driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div[1]/form/div[1]/div/div[1]/div[1]/div[2]/input")).sendKeys("Tester");
        }
	public static void CloseUnwantedWindows(String mid){
		Set<String> allids = driver.getWindowHandles();
        for(String x:allids){
            if(!x.equals(mid)){
                driver.switchTo().window(x);
                driver.close();
            }
        }
    }
}
