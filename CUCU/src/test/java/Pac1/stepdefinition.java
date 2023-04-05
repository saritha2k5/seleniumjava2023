package Pac1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class stepdefinition {

	@Given("Launch the Browser")
	public void launch()
	{
		System.out.println("Broswer is launched");
	}
	
	@And("Navigate to the URL")
	public void Navigate()
	{
		System.out.println("Navigated to the URL");
	}
	
	
	@When("Enter the valid credencials")
	public void Login()
	{
		System.out.println("Entered the Credencials");
	}
	
	@And("Login successfull")
	public void Loginsuccess()
	{
		System.out.println("Login successfull");
	}
	
}
