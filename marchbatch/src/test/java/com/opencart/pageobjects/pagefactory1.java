package com.opencart.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class pagefactory1 {
WebDriver driver;
//By myaccountlink=By.linkText("My Account");
@FindBy(linkText="My Account")
WebElement myaccountlink;
//By loginlink=By.linkText("Login");
@FindBy(linkText="Login")
WebElement loginlink;
//By email=By.id("input-email");
@FindBy(id="input-email")
WebElement email;
//By password=By.id("input-password");
@FindBy(id="input-password")
WebElement password;
//By loginbutton=By.xpath("//button[@type='submit']");
@FindBy(xpath="//button[@type='submit']")
WebElement loginbutton;
public void clickonmyaccount()
{
	myaccountlink.click();
}
public void clickonloginlink()
{
	loginlink.click();
}


public void enteremail(String username)
{
	email.sendKeys(username);
}

public void enterpassword(String password1)
{
	password.sendKeys(password1);
}

public void clickonsubmit()
{
	loginbutton.click();
}

}
