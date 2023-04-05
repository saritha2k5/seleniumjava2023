package com.opencart.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageobjects {
	WebDriver driver;
	By myaccountlink=By.linkText("My Account");
	By loginlink=By.linkText("Login");
	By username=By.id("input-email");
	By password=By.id("input-password");
	By submitbutton=By.xpath("//button[@type='button']");
	
	public pageobjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public boolean clickonmyaccount()
	{
		boolean ismyaccount=driver.findElement(myaccountlink).isDisplayed();
		driver.findElement(myaccountlink).click();
		return ismyaccount;
	}
	
	public void clickonlogin()
	{
		driver.findElement(loginlink).click();
		
	}
	public void enterusername(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterpassword(String pword)
	{
		driver.findElement(password).sendKeys(pword);
	}
	
	public void entersubmitbutton()
	{
		driver.findElement(submitbutton).click();
	}
	
public void close()
{
	driver.close();
}
}
