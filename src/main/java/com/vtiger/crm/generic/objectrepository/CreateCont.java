package com.vtiger.crm.generic.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCont {
	public CreateCont(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Contacts")
	private WebElement Contactslnk;
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement creatConctButton;
	@FindBy(name="lastname")
	private WebElement lastnameedt;
	@FindBy(name="button")
	private WebElement buttonlnk;
	public WebElement getContactslnk() {
		return Contactslnk;
	}
	public WebElement getCreatConctButton() {
		return creatConctButton;
	}
	public WebElement getLastnameedt() {
		return lastnameedt;
	}
	public WebElement getButtonlnk() {
		return buttonlnk;
	}
	
	public void createContLastName(String lastname ) {
		Contactslnk.click();
		creatConctButton.click();
		lastnameedt.sendKeys(lastname);
		buttonlnk.click();
		
		
	}
	
	
	
	

}
