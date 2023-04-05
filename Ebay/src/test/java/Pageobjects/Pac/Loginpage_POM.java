package Pageobjects.Pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage_POM {
	WebDriver driver;
	By signinlink=By.linkText("Sign in");
	By email=By.id("email");
	By pword=By.id("passwd");
	By submit=By.id("SubmitLogin");
	
	public Loginpage_POM(WebDriver driver) {
		this.driver=driver;
		
		// TODO Auto-generated constructor stub
	}
	public void clicksigninlink()
	{
		driver.findElement(signinlink).click();
		
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
