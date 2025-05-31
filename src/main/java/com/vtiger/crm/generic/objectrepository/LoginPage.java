 package com.vtiger.crm.generic.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.crm.generic.fileutility.FileUtility;

public class LoginPage {
	WebDriver driver=null;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(name="user_name")
	private WebElement useredt;
	@FindBy(name="user_password")
	private WebElement userpassedt;
	@FindBy(id="submitButton")
	private WebElement submitbuttonedt;
	
	public WebElement getUseredt() {
		return useredt;
	}
	public WebElement getUserpassedt() {
		return userpassedt;
	}
	public WebElement getSubmitbuttonedt() {
		return submitbuttonedt;
	}
	public void loginP() throws Throwable {
	FileUtility fu = new FileUtility();
	String username = fu.getDataFromProperties("username");
	useredt.sendKeys(username);
	String password = fu.getDataFromProperties("password");
	userpassedt.sendKeys(password);
	submitbuttonedt.click();
	
	}  
}
