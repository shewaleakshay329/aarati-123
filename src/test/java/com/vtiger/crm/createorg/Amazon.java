package com.vtiger.crm.createorg;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
	@Test
	public void amazon() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15",Keys.ENTER);
		WebElement iphone1 = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (256 GB) - Pink']/ancestor::div[@class='puisg-col-inner']//button[text()='Add to cart']"));
		iphone1.click();
		WebElement iPhone2 = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Yellow']/ancestor::div[@class='puisg-col-inner']//button[text()='Add to cart']"));
		iPhone2.click();
		driver.findElement(By.xpath("//a[@href=\"/cart?ref_=ewc_gtc\"]")).click();
		
		WebElement price1 = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (256 GB) - Pink']/ancestor::ul//span[@class='a-text-bold']//span[@aria-hidden='true']"));
		WebElement price2 = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Yellow']/ancestor::ul//span[@class='a-text-bold']//span[@aria-hidden='true']"));
		
		String pr1 = price1.getText().substring(1).replace(",", "");
		Double pr1Int = Double.parseDouble(pr1);
		
		String pr2 = price2.getText().substring(1).replace(",", "");
		Double pr2Int = Double.parseDouble(pr2);
		
		WebElement subTotal = driver.findElement(By.xpath("//span[@id='sc-subtotal-amount-buybox']/span"));
		String subTotalPrice = subTotal.getText().substring(1).replace(",", "");
		Double subTotalInt = Double.parseDouble(subTotalPrice);
		
//		assertEquals(pr1Int+pr2Int, subTotalInt);
		if(pr1Int+pr2Int==subTotalInt) {
			System.out.println("The Total of the Product is Correct");
		}
		else
		{
			System.out.println("The Total of the Product is Not Correct");	
		}
	}

}
