package com.vtiger.crm.generic.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver = null;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(linkText = "Organizations")
	private WebElement Organizationslnk;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement movelnk;
	@FindBy(linkText = "Sign Out")
	private WebElement signoutlnk;
	
	public WebElement getOrganizationslnk() {
		return Organizationslnk;
	}
	
	public WebElement getMovelnk() {
		return movelnk;
	}
	public WebElement getSignoutlnk() {
		return signoutlnk;
	}
	
	public void logOut() {
		movelnk.click();
		signoutlnk.click();
		
	}

}
