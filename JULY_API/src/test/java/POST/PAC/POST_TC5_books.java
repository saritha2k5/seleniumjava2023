package POST.PAC;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;
//import io.restassured.http.ContentType;

public class POST_TC5_books {
	@Test
	public void post_test()
	{		
		JSONObject request=new JSONObject();
		request.put("name", "saritha");
		request.put("job", "trainer");
		given().
		header("Content-Type", "application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().
		statusCode(201).
		log().all();
		
		}

}
