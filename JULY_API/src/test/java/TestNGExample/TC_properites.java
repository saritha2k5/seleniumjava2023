package TestNGExample;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.testng.annotations.Test;

public class TC_properites {
  @Test
  public void f() throws IOException {
	  Properties prob=new Properties();
	  InputStream input=new FileInputStream("C:\\Saritha\\Saritha\\Batch1\\JULY_API\\src\\test\\java\\TestNGExample\\inputdata.properties");
	  prob.load(input);
	  
	  given()
	  .when()
	  	.get(prob.getProperty("url"))
	  .then()
	  .statusCode(200)
	  //.assertThat().body("data[1].first_name", equalTo("Lindsy"))
	  .assertThat()
	  .log().all()
	  .body("data[1].last_name", equalTo("Ferguson"),
	  
	  "data[1].first_name", equalTo("Lindsay")
	  );
  }
}
