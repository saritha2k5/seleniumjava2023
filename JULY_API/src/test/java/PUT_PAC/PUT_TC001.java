package PUT_PAC;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PUT_TC001 {
  @Test
  public void put_test() {
	  JSONObject request=new JSONObject();
		request.put("name", "saritha");
		request.put("job", "trainer");
		given().
		header("Content-Type", "application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		put("https://reqres.in/api/users/2").
		then().
		statusCode(200).
		log().all();
	  
  }
}
