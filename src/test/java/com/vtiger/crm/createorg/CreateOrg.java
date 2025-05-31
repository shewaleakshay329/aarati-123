 package com.vtiger.crm.createorg;

import org.testng.annotations.Test;

import com.vtiger.crm.generic.baseclassutility.BaseClass;
import com.vtiger.crm.generic.excelutility.ExcelUtility;
import com.vtiger.crm.generic.objectrepository.CreateOrgWithName;
import com.vtiger.crm.generic.objectrepository.HomePage;
import com.vtiger.crm.generic.webdriverutility.JavaUtility;

public class CreateOrg extends BaseClass {
	JavaUtility ju = new JavaUtility();
	ExcelUtility eu= new ExcelUtility();
	
	@Test(groups = "ST")
	public void createOrgName() throws Throwable {
		HomePage hp = new HomePage(driver);
		CreateOrgWithName con = new CreateOrgWithName(driver);
		 String ExceptedOrgname = eu.getDataOnExcel("org", 1, 2)+ju.getRandomNum();
		 hp.getOrganizationslnk().click();
		 con.createOrgName(ExceptedOrgname);
		 
		 }
	@Test(groups = "RT")
	public void createOrgWithInd() throws Throwable {
		HomePage hp = new HomePage(driver);
		CreateOrgWithName con = new CreateOrgWithName(driver);
		 String ExceptedOrgname = eu.getDataOnExcel("org", 1, 2)+ju.getRandomNum();
		 hp.getOrganizationslnk().click();
		 con.creatOrgWithInd(ExceptedOrgname);
	}
	@Test(groups = "RT")
	public void createOrgWithCont() throws Throwable {
		HomePage hp = new HomePage(driver);
		CreateOrgWithName con = new CreateOrgWithName(driver);
		 String ExceptedOrgname = eu.getDataOnExcel("org", 1, 2)+ju.getRandomNum();
		 String ExceptedCont = eu.getDataOnExcel("org", 1, 5);
		 hp.getOrganizationslnk().click();
		 con.creatOrgWithConct(ExceptedOrgname,ExceptedCont );
		
	}

}
