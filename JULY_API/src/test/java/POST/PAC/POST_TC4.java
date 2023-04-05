package POST.PAC;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;
//import io.restassured.http.ContentType;

public class POST_TC4 {
	@Test
	public void post_test()
	{		
		RequestSpecification request = RestAssured.given(); 
	    JSONObject requestParams = new JSONObject();
	    requestParams.put("email", "eve.holt@reqres.in");
	    requestParams.put("password", "pistol"); 
	    request.body(requestParams.toJSONString());
	    Response response = request.post("https://reqres.in/api/register"); 
	    ResponseBody body = response.getBody();
	    System.out.println(response.getStatusLine());
	    System.out.println(body.asString());
	   // System.out.println(body.asString());

		}

}
