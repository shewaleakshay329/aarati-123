package com.vtiger.crm.generic.excelutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getDataOnExcel(String sheet , int row , int cell) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\91959\\Desktop\\java1\\Rohan\\TestData\\testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		Row rw = sh.getRow(row);
		String data = rw.getCell(cell).getStringCellValue();
		return data;

  }
	public int getRowCount() throws Throwable {
		FileInputStream fis1 = new FileInputStream("C:\\Users\\91959\\Desktop\\java1\\Rohan\\TestData\\testdata.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis1);
		Sheet sh1 = wb1.getSheet("samsung");
		int rowCount = sh1.getLastRowNum();
		return rowCount;
		
	}
	public void setDataBackToExcel(String sheet , int row , int cell, String data) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\91959\\Desktop\\flipkart.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		Row rw = sh.getRow(row);
	    Cell cel = rw.createCell(cell);
	    cel.setCellType(CellType.STRING);
	    cel.setCellValue(data);
	    FileOutputStream fos = new FileOutputStream("C:\\Users\\91959\\Desktop\\flipkart.xlsx");
	    wb.write(fos);
	    wb.close();
	    
	}
	
	
}
