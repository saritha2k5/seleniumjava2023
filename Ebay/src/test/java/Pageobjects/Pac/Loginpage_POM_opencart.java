package Pageobjects.Pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage_POM_opencart {
	WebDriver driver;
	By myaccountlink=By.linkText("My Account");
	By loginlink=By.linkText("Login");
	
			
	By email=By.id("input-email");
	By pword=By.id("input-password");
	By submit=By.xpath("//button[@type='submit']");
	
	public Loginpage_POM_opencart(WebDriver driver) {
		this.driver=driver;
		
		// TODO Auto-generated constructor stub
	}
	public void clickMyaccountlink()
	{
		driver.findElement(myaccountlink).click();
	}
	
	public void clickloginlink()
	{
		driver.findElement(loginlink).click();
	}
	public void clickonsubmit()
	{
		driver.findElement(submit).click();
	}
	public void enteremail(String username) {
		// TODO Auto-generated method stub
		driver.findElement(email).sendKeys(username);
	}
	public void enterpassword(String password) {
		// TODO Auto-generated method stub
		driver.findElement(pword).sendKeys(password);
	}
	

}
