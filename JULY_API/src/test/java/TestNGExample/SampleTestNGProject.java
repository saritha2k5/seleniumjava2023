package TestNGExample;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class SampleTestNGProject {
	@DataProvider(name="DP1")
	public String[][] getdata() throws IOException
	
	{
		String[][] data=new String[2][2];
		String projectpath=System.getProperty("user.dir");
		  System.out.println("projectpath:"+projectpath);
		  String Excelpath=projectpath+"\\Exceldata.xlsx";
		  FileInputStream input=new FileInputStream(Excelpath);
		  XSSFWorkbook workbook=new XSSFWorkbook(input);
		  XSSFSheet sheet=workbook.getSheet("Sheet1");
		  int rowcount=sheet.getPhysicalNumberOfRows();
		  System.out.println("Row count:"+rowcount);
		  String url=sheet.getRow(0).getCell(0).getStringCellValue();
		  System.out.println("URL is:"+url);
		  data[0][0]=url;
		  System.out.println("dataurl"+data[0][0]);
		  return data;
				  
		  
		
	}
	
	
  @Test(priority=0, dataProvider="DP1")
		  
  public void Get_ListUsers(String geturl) {
	  
	  given()
	  .when()
	  	.get(geturl)
	  .then()
	  .statusCode(200)
	  .log().all()
	  .assertThat()
	  .body("data[1].first_name", equalTo("Lindsay"),
		  		 "data[1].last_name", equalTo("Ferguson"),
		    	  "data[1].email", equalTo("lindsay.ferguson@reqres.in")
	  
	  );
  }
  
  @Test(priority=1)
  public void Get_SingleUser()
  {
	  given()
	  .when()
	  	.get("https://reqres.in/api/users/2")
	  .then()
	  .statusCode(200)
	  .log().all()
	  .assertThat()
	  .body("data[0].first_name", equalTo("Janet"),
	  		 "data[0].last_name", equalTo("Weaver"),
	    	  "data[0].email", equalTo("janet.weaver@reqres.in")
	  
	  );
	  
  }
  
  @Test(priority=2)
  public void Get_SingleUserNotFound()
  {
	  given()
	  .when()
	  	.get("https://reqres.in/api/users/23")
	  .then()
	  .statusCode(404)
	  .assertThat()
	  .log().all();
  }
	  @Test(priority=3)
	 public void Get_ListResource()
	  {
		  given()
		  .when()
		  	.get("https://reqres.in/api/unknown")
		  .then()
		  .statusCode(200)
		  .assertThat()
		  .log().all()
		  .body("data[1].name", equalTo("fuchsia rose"),
			  		 "data[1].year", equalTo("2001"));
			    	 
		    
	    
}
	  
	  @Test(priority=4)
		 public void Get_SingleResource()
		  {
			  given()
			  .when()
			  	.get("https://reqres.in/api/unknown/2")
			  .then()
			  .statusCode(200)
			  .assertThat()
			  .log().all()
			  .body("data.name", equalTo("fuchsia rose"),
				  		 "data.year", equalTo("2001"));
				    	 
			    
		    
	}
	  
	  @Test(priority=4)
		 public void Get_SingleResourceNotFund()
		  {
			  given()
			  .when()
			  	.get("https://reqres.in/api/unknown/23")
			  .then()
			  .statusCode(404)
			  .assertThat()
			  .log().all();
	    	 
			    
		    
	}
	  @Test(priority=5)
	  public void Post_Create()
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
			log().all()
			.body("name", equalTo("saritha"),
			  		 "job", equalTo("trainer"));
	  }
	  
	  
	  @Test(priority=6)
	  public void Put_Update()
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
			put("https://reqres.in/api/users/2").
			then().
			statusCode(200).
			log().all()
			.body("name", equalTo("saritha"),
			  		 "job", equalTo("trainer"));
		  
	  }
	  
	  @Test(priority=7)
	  public void Patch_Update()
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
			patch("https://reqres.in/api/users/2").
			then().
			statusCode(200).
			log().all()
			.body("name", equalTo("saritha"),
			  		 "job", equalTo("trainer"));
		  
		  
	  }
	  
	  @Test(priority=8)
	  public void Delete_TC() {
		  
		  given()
			 .when()
			 .delete("https://reqres.in/api/users/2")
			 .then()
			 .statusCode(204)
			 .log().all();
	  }
	  
}