package com.opencart.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.opencart.pageobjects.pagefactory1;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Testcase_Pagafactory {
	
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String projectpath=System.getProperty("user.dir");
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter(projectpath+"\\Reports\\TC1.html");
		extent.attachReporter(spark);
		ExtentTest test=extent.createTest("Login to OpenCart");
		
		
		String propertypath="C:\\Saritha\\Saritha\\Batch1\\marchbatch\\src\\test\\java\\com\\opencart\\testdata\\input.properties";
		propertypath=propertypath.trim();
		
		InputStream input=new FileInputStream(propertypath);
		Properties prob=new Properties();
		prob.load(input);
		String url=prob.getProperty("url");
		
		
		File f1=new File(projectpath+"\\src\\test\\java\\com\\opencart\\testdata\\data.xlsx");
		FileInputStream fis=new FileInputStream(f1);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rowcount=sheet.getPhysicalNumberOfRows();
		for(int i=1;i<rowcount;i++)
		{
					String username=sheet.getRow(i).getCell(0).getStringCellValue();
				String password=sheet.getRow(i).getCell(1).getStringCellValue();
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		pagefactory1 obj=PageFactory.initElements(driver,pagefactory1.class);
		driver.get(url);
		obj.clickonmyaccount();
		if(driver.findElement(By.linkText("Login")).isDisplayed())
		{
			test.pass("My Account is clicked");
		}
		else
		{
			test.fail("My Account is not clicked");
			
		}
		obj.clickonloginlink();
		obj.enteremail(username);
		obj.enterpassword(password);
		obj.clickonsubmit();
		driver.quit();
		}
		
	extent.flush();	
		/*driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys("marchbatch@gmail.com");
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys("welcome");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		*/
	}

}
