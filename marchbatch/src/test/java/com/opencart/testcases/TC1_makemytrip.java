package com.opencart.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.opencart.pageobjects.pagefactory1;
import com.opencart.pageobjects.pagefactory_makemytrip;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC1_makemytrip {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String projectpath=System.getProperty("user.dir");
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter(projectpath+"\\Reports\\TC1_makemytrip.html");
		extent.attachReporter(spark);
		ExtentTest test=extent.createTest("book the hotel");
		String propertypath="C:\\Saritha\\Saritha\\Batch1\\marchbatch\\src\\test\\java\\com\\opencart\\testdata\\input.properties";
		propertypath=propertypath.trim();
		InputStream input=new FileInputStream(propertypath);
		Properties prob=new Properties();
		prob.load(input);
		String url=prob.getProperty("makemytripurl");
		File f1=new File(projectpath+"\\src\\test\\java\\com\\opencart\\testdata\\makemytrip.xlsx");
		FileInputStream fis=new FileInputStream(f1);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rowcount=sheet.getPhysicalNumberOfRows();
		for(int i=1;i<rowcount;i++)
		{
					String city=sheet.getRow(i).getCell(0).getStringCellValue();
				String location=sheet.getRow(i).getCell(1).getStringCellValue();
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		pagefactory_makemytrip obj=PageFactory.initElements(driver,pagefactory_makemytrip.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get(url);
		Thread.sleep(50);
		obj.clickonhotel();
		test.pass("hotel is clicked");
		obj.clickonsearchbutton();
		test.pass("search button is clicked");
		obj.entercityname(city);
		test.pass("entered the city");
		obj.enterhotellocation(location,driver);
		test.pass("Entered the location");
			
		obj.clickonhotelid();
		test.pass("Hotel id clicked");
		obj.bookthisnow(driver);
	test.pass("booked the hotel");
	
	}
extent.flush();
	}
	
}