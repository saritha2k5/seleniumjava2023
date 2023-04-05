package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class setpdef {
	WebDriver driver;
	@Given("^launch the browser$")
	public void launch_the_browser() throws Throwable {
		 WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
	}

	@Given("^navigate to the url$")
	public void navigate_to_the_url() throws Throwable {
		 driver.get("https://demo.opencart.com/");
		  
	}

	@When("^click of regier$")
	public void click_of_regier() throws Throwable {
		driver.findElement(By.linkText("My Account")).click();
		  driver.findElement(By.linkText("Register")).click();
	}

	@When("^enter the details$")
	public void enter_the_details() throws Throwable {
		driver.findElement(By.id("input-firstname")).sendKeys("Saritha");
		  
	}

	@Then("^click on continue$")
	public void click_on_continue() throws Throwable {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("^Verify the Registration is successfull$")
	public void verify_the_Registration_is_successfull() throws Throwable {
	    System.out.println("Registration Successfull");
}
}