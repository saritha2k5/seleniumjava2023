package StepDefinition;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class listusers {
	
	@Given("give the url for GET")
	public void give_the_url_for_get() {
	   
		Response res=RestAssured.get("https://reqres.in/api/users?page=2");
		 System.out.println(res.getStatusCode());
	}

	

}
