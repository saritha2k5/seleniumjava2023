package StepDefinition;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class stepdeflistuser {


@Given("get the url")
public void get_the_url(io.cucumber.datatable.DataTable dataTable) {
	/*Response res=RestAssured.get("https://reqres.in/api/users?page=2");
	System.out.println("Response:"+res);
	System.out.println(res.getStatusCode());
		System.out.println("hello world");*/
	

	RestAssured.baseURI="https://reqres.in/api/users?page=2";
	RequestSpecification httprequest=RestAssured.given();
	Response res=httprequest.request(Method.GET);
	System.out.println("Status code:"+res.getStatusCode());
	System.out.println("Response Body:"+res);
	System.out.println("Get Executed");
}

}
