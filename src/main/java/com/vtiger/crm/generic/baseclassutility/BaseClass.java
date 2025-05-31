package com.vtiger.crm.generic.baseclassutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.xml.XmlTest;

import com.vtiger.crm.generic.databaseutility.DatabaseUtility;
import com.vtiger.crm.generic.fileutility.FileUtility;
import com.vtiger.crm.generic.objectrepository.HomePage;
import com.vtiger.crm.generic.objectrepository.LoginPage;
import com.vtiger.crm.generic.webdriverutility.WebDriverUtility;

public class BaseClass {
	public WebDriver driver = null;
	WebDriverUtility wu = new WebDriverUtility();
	DatabaseUtility du = new DatabaseUtility();
	FileUtility fu = new FileUtility();

	
	
	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() throws Throwable {
	System.out.println("connect to DB. Report Config");
	du.getConnectTodata();
	}
	@BeforeClass(alwaysRun = true)
	public void beforeClass() throws Throwable {
		System.out.println("launch the browser");
		String Browser = fu.getDataFromProperties("browser");
		if(Browser.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		else if (Browser.equals("Firefox")) {
			driver = new FirefoxDriver();
			
		}
		else if (Browser.equals("Edge")) {
			driver = new EdgeDriver();
			
		}
		else {
			driver = new ChromeDriver();
		}
		wu.maxmizeWindow(driver);
		wu.getImplicitWait(driver);
		String Url = fu.getDataFromProperties("url");
		driver.get(Url);
	}
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() throws Throwable {
		System.out.println("login");
		LoginPage lp = new LoginPage(driver);

	    lp.loginP();
	}
	@AfterMethod(alwaysRun = true)
	public void afterMethod() throws Throwable {
		System.out.println("logout");
		HomePage hp = new HomePage(driver);
		Thread.sleep(500);
        hp.logOut();
	}
	@AfterClass(alwaysRun=true)
	public void afterClass() {
		System.out.println("======afterClass=====");
		driver.quit();
	}
	@AfterSuite(alwaysRun=true)
	public void afterSuite() {
		System.out.println("=======afterSuite======");
	}
	
	

}
