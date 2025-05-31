package com.vtiger.crm.generic.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.crm.generic.webdriverutility.WebDriverUtility;

public class CreateOrgWithName {
	public CreateOrgWithName(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createOrgButton;
	@FindBy(name="accountname")
	private WebElement accountnameedt;
	@FindBy(name="button")
	private WebElement buttonedt;
	@FindBy(name="industry")
	private WebElement industrydd;
	@FindBy(name="accounttype")
	private WebElement accounttypedd;
	@FindBy(id="phone")
	private WebElement phonedt;
	
	
	
	public WebElement getCreateOrgButton() {
		return createOrgButton;
	}
	public WebElement getAccountnameedt() {
		return accountnameedt;
	}
	public WebElement getButtonedt() {
		return buttonedt;
	}
	public WebElement getIndustrydd() {
		return industrydd;
	}
	public WebElement getAccounttypedd() {
		return accounttypedd;
	}
	public WebElement getPhonedt() {
		return phonedt;
	}
	
	public void createOrgName(String accountname ) {
		
		createOrgButton.click();
		accountnameedt.sendKeys(accountname);
		buttonedt.click();
		
		}
	public void creatOrgWithInd(String accountname) {
		WebDriverUtility wu = new WebDriverUtility();
		createOrgButton.click();
		accountnameedt.sendKeys(accountname);
		wu.selectOptionFromDropdown(industrydd, "Banking");
		wu.selectOptionFromDropdown(accounttypedd, "Analyst");
		buttonedt.click();
	}
	public void creatOrgWithConct(String accountname, String phonenum) {
		WebDriverUtility wu = new WebDriverUtility();
		createOrgButton.click();
		accountnameedt.sendKeys(accountname);
		wu.selectOptionFromDropdown(industrydd, "Banking");
		wu.selectOptionFromDropdown(accounttypedd, "Analyst");
		phonedt.sendKeys(phonenum);
		
	}
	
	

}
