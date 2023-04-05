package com.opencart.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class datautil {
	
	
	@DataProvider(name="loginexcel")
	public String[][] getexceldata() throws IOException
	{
		
		String projectPath=System.getProperty("user.dir");
		System.out.println("project path:"+projectPath);
		String excelpath=projectPath+"\\src\\com\\opencart\\testdata\\data.xlsx";
		FileInputStream input1=new FileInputStream(excelpath);

		XSSFWorkbook workbook=new XSSFWorkbook(input1);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowcount=sheet.getPhysicalNumberOfRows();

		String[][] data=new String[4][2];
		System.out.println(rowcount);
		for(int i=0;i<rowcount;i++)
		{

		data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println(data[i][0]);
		data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
		System.out.println(data[i][1]);


		
	}
return data;	
	
	}


}
