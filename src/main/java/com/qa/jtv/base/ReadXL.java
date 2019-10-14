package com.qa.jtv.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXL {
	static XSSFWorkbook wb;
	public static Object[][] getTestData() 
	{
		FileInputStream fis=null;
		try {
			 fis=new FileInputStream("C:\\Melbourne\\Melbourne\\src\\main\\java\\com\\qa\\jtv\\base\\dataDriven.xlsx");
		    }
			catch (FileNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
				
				try {
					wb = new XSSFWorkbook(fis);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			
				Sheet s1=wb.getSheet("Sheet1");
				Object[][] data=new Object[s1.getLastRowNum()][s1.getRow(0).getLastCellNum()];
				for(int i=0;i<s1.getLastRowNum();i++)
				{
					for(int j=0; j< s1.getRow(0). getLastCellNum();j++)
					{
						data[i][j] = s1.getRow(i+1).getCell(j).toString();
				    }
				
	     		} 
		return data;
	}
	
}
