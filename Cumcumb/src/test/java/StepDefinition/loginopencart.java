package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginopencart {
WebDriver driver;
	@Given("launch the url")
	public void launchtheurl()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Saritha\\Saritha\\HCL\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
	}
	@When("Enter the username and password")
	public void  Enter_the_username_and_password()
	{
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("john@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("welcom");
	}
	
	 @And("Clcik on login Button")
	 public void  Clcik_on_login_Button()
	 {
		 driver.findElement(By.xpath("//button[@type='button']")).click();
		 
	 }
	 @Then("Login should be successful")
	 public void Login_should_be_successful()
	 {
		 System.out.println("Login successfull");
	 }
			 
}
