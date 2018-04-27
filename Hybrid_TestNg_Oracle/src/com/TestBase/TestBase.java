package com.TestBase;

import java.io.FileInputStream;
import java.util.Hashtable;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.asserts.SoftAssert;

import xls.ShineXlsReader;

public class TestBase {

	public static Properties prop;
	public static FileInputStream fip;
	public static String Browser;
	public static WebDriver driver;
	public static SoftAssert st;
	public static int tc = 0;
	public static Hashtable<String, String> ht;
	public static ShineXlsReader Mxls;
	
	public static void OpenBrowser() throws Throwable {
		st = new SoftAssert();
		fip = new FileInputStream(".\\src\\com\\config\\Or.Properties");
		prop = new Properties();
		prop.load(fip);
		
		Browser = prop.getProperty("Browsertype");
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
		
		driver.get("http://localhost:9000/login.do");	//Open URL
		driver.manage().window().maximize();		//maximize browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void moduledriver() {
		ht = new Hashtable<String, String>();
		Mxls = new ShineXlsReader(".\\src\\com\\excelFiles\\Moduledriver.xlsx");
		int modulecount = Mxls.getRowCount("Mainsheet");
		for (int i = 2; i <= modulecount; i++) {
			String modulename = Mxls.getCellData("Mainsheet", 0, i);
			String exestatus = Mxls.getCellData("Mainsheet", 1, i);
			if (exestatus.equalsIgnoreCase("yes")) {
				int testcount = Mxls.getRowCount(modulename);
				for (int j=2 ;j <= testcount; j++) {
					 String testid = Mxls.getCellData(modulename, 0, j);
                     String runstatus = Mxls.getCellData(modulename, 1, j);
                     ht.put(testid, runstatus);
				}
			}
		}
	}
	public static void CloseBrowser() {
		driver.quit();
	}
}

