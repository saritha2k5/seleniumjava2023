package com.opencart.testcases;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.opencart.pageobjects.pagefactory;
import com.opencart.utilities.datautil;

public class loginopencarttest_PageFactory_TestNG {

		
	//public static void main(String[] args) throws IOException {
	@Test(dataProvider="loginexcel",dataProviderClass=datautil.class)
	public void test1(String username,String password)
	{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Saritha\\Saritha\\HCL\\chromedriver.exe");



WebDriver driver=new ChromeDriver();
//launch the URL		
driver.get("https://demo.opencart.com/");
//Get the title of the webpage
		//System.out.println("Title is:"+driver.getTitle());
		assertEquals(driver.getTitle(), "Your Store");
		
		//pageobjects obj=new pageobjects(driver);
		//
		pagefactory obj=PageFactory.initElements(driver, pagefactory.class);
		obj.clickonmyaccount();
		obj.clickonlogin();
		obj.enterusername(username);
		obj.enterpassword(password);
		obj.entersubmitbutton();
		obj.close(driver);
		
		
		/*driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(data[i][0]);
		driver.findElement(By.id("input-password")).sendKeys(data[i][1]);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.close();*/
		
		
	}

	}

