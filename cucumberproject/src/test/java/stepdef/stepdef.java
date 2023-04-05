package stepdef;

import java.io.FileInputStream;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef {
	

@Given("Post the Student details")
public void post_the_Student_details() {
	
		    RequestSpecification httpRequest = RestAssured.given().auth().preemptive().basic("username", "password");

		JSONObject requestParams = new JSONObject();


		String projectpath=System.getProperty("user.dir");
		System.out.println("projectpath:"+projectpath);
		String Excelpath="C:\\Users\\kgajarla\\Documents\\workspace-spring-tool-suite-4-4.15.2.RELEASE\\HeroesData.xlsx";
		FileInputStream input=new FileInputStream(Excelpath);
		XSSFWorkbook workbook=new XSSFWorkbook(input);
		XSSFSheet sheet=workbook.getSheet("student");
		int rowcount=sheet.getPhysicalNumberOfRows();

		for(int i=1;i<rowcount;i++)
		{​
		System.out.println("Row count:"+rowcount);
		int id=Integer.parseInt(sheet.getRow(i).getCell(0).getRawValue());
		String name=sheet.getRow(i).getCell(1).getStringCellValue();
		int age=Integer.parseInt(sheet.getRow(i).getCell(2).getRawValue());
		String email=sheet.getRow(i).getCell(3).getStringCellValue();
		//System.out.println("id:"+id);
		//System.out.println("name:"+name);
		//System.out.println("age:"+age);
		//System.out.println("email:"+email);

		requestParams.put("id", id);
		requestParams.put("name", name);
		requestParams.put("age", age);
		requestParams.put("email", email);
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.post("http://localhost:8099/student");
		ResponseBody body = response.getBody();
		System.out.println(response.getStatusLine());
		System.out.println(body.asPrettyString());

		}​
		
		    
		
}

@When("Get the Student Details")
public void get_the_Student_Details() {
	
		    //Using the preemptive directive of basic auth to send credentials to the server
		RequestSpecification httpRequest = RestAssured.given().auth().preemptive().basic("username", "password");
		Response res = httpRequest.get("http://localhost:8099/student");
		ResponseBody body = res.body();
		//Converting the response body to string
		String rbdy = body.asString();
		//System.out.println("Data from the GET API- "+rbdy);
		System.out.println("Status code:" + res.getStatusCode());
		System.out.println("Response Body:" + res.asPrettyString());
		System.out.println(res.getSessionId());
		String resBodyAsString = res.getBody().asString();
		//<https://teams.microsoft.com/l/message/19:krUd7il_FmP7cNXjT3iiDctz87-9PqDoRuQah9G3oao1@thread.tacv2/1660716332945?tenantId=27282fdd-4c0b-4dfb-ba91-228cd83fdf71&amp;groupId=ef3a5178-6a2f-41db-82e9-4f1f36c0d54c&amp;parentMessageId=1654592437976&amp;teamName=Capgemini-75-Testing-B7-API&amp;channelName=General&amp;createdTime=1660716332945>
}

@When("Put or update the Student details")
public void put_or_update_the_Student_details() {

    RequestSpecification httpRequest = RestAssured.given().auth().preemptive().basic("username", "password");

JSONObject requestParams = new JSONObject();


String projectpath=System.getProperty("user.dir");
System.out.println("projectpath:"+projectpath);
String Excelpath="C:\\Users\\kgajarla\\Documents\\workspace-spring-tool-suite-4-4.15.2.RELEASE\\HeroesData.xlsx";
FileInputStream input=new FileInputStream(Excelpath);
XSSFWorkbook workbook=new XSSFWorkbook(input);
XSSFSheet sheet=workbook.getSheet("student");
int rowcount=sheet.getPhysicalNumberOfRows();

for(int i=1;i<rowcount;i++)
{​
System.out.println("Row count:"+rowcount);
int id=Integer.parseInt(sheet.getRow(i).getCell(0).getRawValue());
String name=sheet.getRow(i).getCell(1).getStringCellValue();
int age=Integer.parseInt(sheet.getRow(i).getCell(2).getRawValue());
String email=sheet.getRow(i).getCell(3).getStringCellValue();
//System.out.println("id:"+id);
//System.out.println("name:"+name);
//System.out.println("age:"+age);
//System.out.println("email:"+email);

requestParams.put("id", id);
requestParams.put("name", name);
requestParams.put("age", age);
requestParams.put("email", email);
httpRequest.header("Content-Type","application/json");
httpRequest.body(requestParams.toString());
Response response = httpRequest.post("http://localhost:8099/student");
ResponseBody body = response.getBody();
System.out.println(response.getStatusLine());
System.out.println(body.asPrettyString());

}​
​
}

@Then("Delete a Studentt Details")
public void delete_a_Studentt_Details() {
	
		    RequestSpecification httpRequest = RestAssured.given().auth().preemptive().basic("username", "password");
		Response res = httpRequest.delete("http://localhost:8099/student/5");
		ResponseBody body = res.body();
		//Converting the response body to string
		String rbdy = body.asString();
		//System.out.println("Data from the GET API- "+rbdy);
		System.out.println("Status code:" + res.getStatusCode());
		System.out.println("Response Body:" + res.asPrettyString());
		System.out.println(res.getSessionId());
		}​
		//<https://teams.microsoft.com/l/message/19:krUd7il_FmP7cNXjT3iiDctz87-9PqDoRuQah9G3oao1@thread.tacv2/1660716389496?tenantId=27282fdd-4c0b-4dfb-ba91-228cd83fdf71&amp;groupId=ef3a5178-6a2f-41db-82e9-4f1f36c0d54c&amp;parentMessageId=1654592437976&amp;teamName=Capgemini-75-Testing-B7-API&amp;channelName=General&amp;createdTime=1660716389496>
}

}
