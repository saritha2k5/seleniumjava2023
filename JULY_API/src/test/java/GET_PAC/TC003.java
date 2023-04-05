package GET_PAC;

import org.testng.annotations.Test;

//import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class TC003 {
  @Test
  public void f() {

	
	 given().auth().preemptive().basic("username", "password")
	 .when()
	 .get("http://localhost:7777/book")
	 .then()
	 .statusCode(200)
	 .assertThat()
	  .log().all()
	  .body("data[1].last_name", equalTo("Ferguson"),
	  
	  "data[1].first_name", equalTo("Lindsay")
	  );
	 
	 
	 
	 
	  	
	  
  }

}
