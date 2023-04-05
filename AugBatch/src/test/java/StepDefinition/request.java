package StepDefinition;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;

public class request {
	
	@Given("get url1 {string}")
	public void get_url1(String url1) {
		given().contentType(ContentType.JSON)
		  .when()
		  	.get(url1)
		  .then()
		  .statusCode(200)
		   .assertThat()
		  .log().all()
		  .body("data[1].last_name", equalTo("Ferguson"),
		  
		  "data[1].first_name", equalTo("Lindsay")
		  );
		 
	}
	@Given("get url2 {string}")
	public void get_url2(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("get url3 {string}")
	public void get_url3(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("get url4 {string}")
	public void get_url4(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
