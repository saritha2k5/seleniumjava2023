package GET_PAC;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class TC004 {
  @Test
  public void GET_TC004() {
	  given()
	  .when()
	  .get("https://reqres.in/api/users?page=2")
	  .then()
	  .statusCode(200)
	   .assertThat()
	  .body("data[1].last_name", equalTo("Ferguson"),
	  
	  "data[1].first_name", equalTo("Lindsay")
	  );	  
	  
	  
  }
  
}
