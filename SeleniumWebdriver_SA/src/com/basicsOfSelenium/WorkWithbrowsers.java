/**
 * @author saragarw
 * setting property of browser 
 * Opens Chrome, IE and Firefox
 * Goes to seleniumhq.org
 * Maximizes window
 */
package com.basicsOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class WorkWithbrowsers {
	public WebDriver driver;
	public String Browser = "ie";
	@Test
	public void workwithbrow() {
		
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
		
		driver.get("http://www.seleniumhq.org/");	//Open URL
		driver.manage().window().maximize();		//maximize browser
		}
}
