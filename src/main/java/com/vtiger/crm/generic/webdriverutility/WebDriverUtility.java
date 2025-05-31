package com.vtiger.crm.generic.webdriverutility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	public void getImplicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		public void maxmizeWindow(WebDriver driver) {
			driver.manage().window().maximize();
			
		}
		public void getExplicitWait(WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
		}
		public void moveToElement(WebDriver driver, WebElement element) {
			Actions act = new Actions(driver);
			act.moveToElement(element).perform();
			
		}
		public void selectOptionFromDropdown(WebElement element, String value) {
			Select sel = new Select(element);
			sel.selectByValue(value);
		}
		
		public WebDriver switchNewWindow(WebDriver driver, String patialurl) {
			Set<String> windid = driver.getWindowHandles();
			for (String id :windid) {
				driver.switchTo().window(id);
				String url = driver.getCurrentUrl();
				if(url.contains(patialurl)){
					return driver;
				}
				
			}
			return driver;
			
		}
		public void switchtoAlertAndAccept(WebDriver driver) {
			driver.switchTo().alert().accept();
			
		}





}
