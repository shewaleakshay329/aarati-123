package com.vtiger.crm.createorg;

import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vtiger.crm.generic.baseclassutility.BaseClass;
import com.vtiger.crm.generic.excelutility.ExcelUtility;

public class PracticeDataProvider extends BaseClass {
	@Test(dataProvider = "getData")
	public void createOrg(String a, String b) {
		System.out.print(a);
		System.out.println(b);
		
	}
	
	@DataProvider
	public Object[][]getData() throws Throwable{
		ExcelUtility eu = new ExcelUtility();
		int rowCount = eu.getRowCount();
		Object[][] object = new Object[rowCount][2];
		for(int i=0; i<rowCount;i++)	{
			String Product = eu.getDataOnExcel("samsung", i+1, 0);
			String Productname = eu.getDataOnExcel("samsung", i+1, 1);
			object[i][0]= Product;
			object[i][1]= Productname;
			
		}
		return object;
	}

}
