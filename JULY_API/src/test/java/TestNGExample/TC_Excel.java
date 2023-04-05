package TestNGExample;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TC_Excel {
  @Test
  public void f() throws IOException {
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
	    
	  given()
	  .when()
	  	.get(url)
	  .then()
	  .statusCode(200)
	   .assertThat()
	  .log().all()
	  .body("data[1].last_name", equalTo("Ferguson"),
	  
	  "data[1].first_name", equalTo("Lindsay")
	  );
  }
}
