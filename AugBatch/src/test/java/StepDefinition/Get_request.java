package StepDefinition;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_request {

	
	@Given("get url1")
	public void get_url1() {
	 System.out.println("utl1");  
	 Response res=RestAssured.get("https://reqres.in/api/users?page=2");
	  System.out.println("Response:"+res);
	  System.out.println(res.getStatusCode());
	  
	}

	@Given("get url2")
	public void get_url2() {
		 System.out.println("utl2");  
	}

	@Given("get url3")
	public void get_url3() {
		 System.out.println("utl3");  
	}

	@Given("get url4")
	public void get_url4() {
		 System.out.println("utl4");  
	}

	@Given("get url5")
	public void get_url5() {
		 System.out.println("utl5");  
	    
	}

	
}
