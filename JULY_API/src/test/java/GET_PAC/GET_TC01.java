package GET_PAC;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class GET_TC01 {
  @Test
  public void GET_API() {
	  Response res=RestAssured.get("https://reqres.in/api/users?page=2");
	  System.out.println("Response:"+res);
	  System.out.println(res.getStatusCode());
	  
		 
	  
  }
}
