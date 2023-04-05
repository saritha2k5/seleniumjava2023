package com.opencart.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pagefactory {
	WebDriver driver;
	//By myaccountlink=By.linkText("My Account");
	@FindBy(linkText="My Account")
	WebElement myaccountlink;
	//By loginlink=By.linkText("Login");
	@FindBy(linkText="Login")
	WebElement loginlink;
	//By username=By.id("input-email");
	@FindBy(id="input-email")
	WebElement username;
	
	//By password=By.id("input-password");
	@FindBy(id="input-password")
	WebElement password;
	//By submitbutton=By.xpath("//button[@type='button']");
	@FindBy(xpath="//button[@type='button']")
	WebElement submitbutton;
	
	
	public void clickonmyaccount()
	{
		//driver.findElement(myaccountlink).click();
		myaccountlink.click();
	}
	
	public void clickonlogin()
	{
		loginlink.click();
		
	}
	public void enterusername(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void enterpassword(String pword)
	{
		password.sendKeys(pword);
	}
	
	public void entersubmitbutton()
	{
		submitbutton.click();
	}
	
public void close(WebDriver driver)
{
	driver.close();
}
}
