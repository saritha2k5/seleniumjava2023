package DELETE.PAC;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class DELETE_TC001 {
  @Test
  public void f() {
	  
	  given()
		 .when()
		 .delete("https://reqres.in/api/users/2")
		 .then()
		 .statusCode(204)
		 .log().all();
  }
}
