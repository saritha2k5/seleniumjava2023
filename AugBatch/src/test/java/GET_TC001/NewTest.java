package GET_TC001;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class NewTest {
  @Test
  public void f() {
	  
	  Response res=RestAssured.get("https://reqres.in/api/users?page=2");
	  System.out.println("Response:"+res);
	  System.out.println(res.getStatusCode());
	  
  }
}
