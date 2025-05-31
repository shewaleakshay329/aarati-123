package com.vtiger.crm.generic.webdriverutility;

import java.util.Random;

public class JavaUtility {
	public int getRandomNum() {
		Random random = new Random();
		int randomNum = random.nextInt(2000);
		return randomNum;
	}

}
