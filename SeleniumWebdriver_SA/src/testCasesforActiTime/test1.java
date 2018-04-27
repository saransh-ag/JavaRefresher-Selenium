package testCasesforActiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test1 {
	public WebDriver driver;
	public String Browser = "chrome";
	@Test
	public void testcase1() {
		
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
		
		driver.get("http://localhost:9000/login.do");	//Open URL
		driver.manage().window().maximize();		//maximize browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Login
		WebElement username = driver.findElement(By.xpath(".//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/input"));
		username.sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("manager");
		driver.findElement(By.xpath(".//*[@id='loginButton']")).click();
		//Click on task
		driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[5]/a/img")).click();
		//click on pro and customer
		driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[5]/div/table/tbody/tr/td[6]/nobr/a")).click();
		//click on create new customer
		driver.findElement(By.xpath(".//*[@id='customersProjectsForm']/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/input[1]")).click();
		
		//create new customer
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/table/tbody/tr[1]/td[3]/input")).sendKeys("CustomerA");
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/table/tbody/tr[2]/td[3]/textarea")).sendKeys("DescriptionA");
		driver.findElement(By.xpath(".//*[@id='active_customers_action']")).click();
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[8]/td/input[1]")).click();
		
		//verify success msg
		/* 
		 * Method 1: Check text and print
		String text = driver.findElement(By.xpath("")).getText();
		System.out.println("Success Message: " + text);
		*/
		
		try{
	        driver.findElement(By.xpath(".//*[@id='SuccessMessages']/tbody/tr/td/span")).isDisplayed();
	        //Logout
	                driver.findElement(By.xpath(".//*[@id='logoutLink']")).click();
	        }catch(Throwable t){
	            st.fail("Sucess msg does not Displayed...");
	            //Logout
	            driver.findElement(By.xpath(".//*[@id='logoutLink']")).click();
	            //click on cancel creation
	            driver.findElement(By.xpath(".//*[@id='DiscardChangesButton']")).click();
	        }
		//logout
		//driver.findElement(By.xpath(".//*[@id='logoutLink']")).click();
		
		//close browser
		driver.quit();
		st.assertAll();

		}

}
