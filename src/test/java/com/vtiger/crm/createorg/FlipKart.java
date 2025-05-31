package com.vtiger.crm.createorg;

import java.sql.SQLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;
import com.vtiger.crm.generic.excelutility.ExcelUtility;

public class FlipKart {
	@Test
	public void print() throws Throwable  {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("ipone"+Keys.ENTER);
	List<WebElement> allelement = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
	
    int size = allelement.size();
    for(int i=1;i<=size;i++) {
    String text= allelement.get(i-1).getText();
    
    ExcelUtility eu = new ExcelUtility();
//	String text = null;
	eu.setDataBackToExcel("iphone",i, 1, text);
    }
	  
	
	
	
	
		
	}

}
