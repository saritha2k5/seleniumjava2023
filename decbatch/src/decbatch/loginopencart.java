package decbatch;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class loginopencart {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Saritha\\Saritha\\HCL\\chromedriver.exe");

String projectPath=System.getProperty("user.dir");
System.out.println("project path:"+projectPath);
String excelpath=projectPath+"\\data.xlsx";
FileInputStream input1=new FileInputStream(excelpath);

XSSFWorkbook workbook=new XSSFWorkbook(input1);
XSSFSheet sheet=workbook.getSheet("Sheet1");
int rowcount=sheet.getPhysicalNumberOfRows();

String[][] data=new String[3][3];
System.out.println(rowcount);
for(int i=0;i<=rowcount;i++)
{

data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
System.out.println(data[i][0]);
data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
System.out.println(data[i][1]);



WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		System.out.println("Title is:"+driver.getTitle());
		String title=driver.getTitle();
		
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Saritha\\Saritha\\Batch1\\decbatch\\report6thjan.html");
		extent.attachReporter(spark);
		ExtentTest test=extent.createTest("Verify the title of the webpage");
		if(title.equals("Your Store"))
		{
			test.pass("The tile is displayed as expected");
			
		}
		
		else
		{
			test.fail("The tile is not displayed as expected");
		}
		
		extent.flush();
		pageobjects obj=new pageobjects(driver);
		if(obj.clickonmyaccount())
			{
			test.pass("My Account link is displayed as expected");
			}
		else
		{
			test.fail("My Account link is not displayed as expected");
		}
		obj.clickonlogin();
		obj.enterusername(data[i][0]);
		obj.enterpassword(data[i][1]);
		obj.entersubmitbutton();
		obj.close();
		
		//extent.flush();
		
		/*driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(data[i][0]);
		driver.findElement(By.id("input-password")).sendKeys(data[i][1]);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.close();*/
		
		
	}

	}
}
