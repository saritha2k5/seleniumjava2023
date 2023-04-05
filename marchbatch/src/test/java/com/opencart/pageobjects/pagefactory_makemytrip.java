package com.opencart.pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
public class pagefactory_makemytrip {
WebDriver driver;
//By myaccountlink=By.linkText("My Account");
@FindBy(linkText="Hotels")
WebElement hotellink;
//By loginlink=By.linkText("Login");
@FindBy(id="hsw_search_button")
WebElement searchbutton;
//By email=By.id("input-email");
@FindBy(xpath="//input[@placeholder='Search for locality / hotel name']")
WebElement cityname;
//By password=By.id("input-password");
@FindBy(linkText="South Goa, Goa")
WebElement hotellocation;
//By loginbutton=By.xpath("//button[@type='submit']");
@FindBy(xpath="//span[@id='htl_id_seo_201905301952544998']")
WebElement hotelid;

@FindBy(linkText="BOOK THIS NOW")
WebElement book;
public void clickonhotel()
{
	hotellink.click();
}
public void clickonsearchbutton()
{
	searchbutton.click();
}


public void entercityname(String city)
{
	cityname.sendKeys(city);
}

public void enterhotellocation(String location, WebDriver driver)
{
	WebElement ele=driver.findElement(By.linkText(location));
	Actions builder=new Actions(driver);
	builder.moveToElement(ele).perform();
	ele.click();
	
	hotellocation.sendKeys(location);
}

public void clickonhotelid()
{
	hotelid.click();
}

public void bookthisnow(WebDriver driver)
{
	
	List<String> l1=new ArrayList<String>(driver.getWindowHandles());
	System.out.println(l1.size());
		driver.switchTo().window(l1.get(1));
		System.out.println("Windws:"+driver.getCurrentUrl());
		
	book.click();
}

}
