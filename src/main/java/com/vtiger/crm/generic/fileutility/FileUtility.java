package com.vtiger.crm.generic.fileutility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	public String getDataFromProperties(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\91959\\Desktop\\java1\\Rohan\\TestData\\COMMON.properties");
		Properties p = new Properties();
		p.load(fis);
		String property = p.getProperty(key);
		return property;

   }
}
