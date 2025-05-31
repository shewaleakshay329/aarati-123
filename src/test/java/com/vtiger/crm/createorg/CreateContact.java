package com.vtiger.crm.createorg;

import org.testng.annotations.Test;

import com.vtiger.crm.generic.baseclassutility.BaseClass;
import com.vtiger.crm.generic.excelutility.ExcelUtility;
import com.vtiger.crm.generic.objectrepository.CreateCont;
import com.vtiger.crm.generic.webdriverutility.JavaUtility;

public class CreateContact extends BaseClass {
	JavaUtility ju = new JavaUtility();
	ExcelUtility eu= new ExcelUtility();
	
	@Test(groups = "ST")
	public void createContact() throws Throwable {
		CreateCont cc = new CreateCont(driver);
		String ExpectedLastName = eu.getDataOnExcel("org", 1, 6)+ju.getRandomNum();
		cc.createContLastName(ExpectedLastName);
		
		
	}
	

}
