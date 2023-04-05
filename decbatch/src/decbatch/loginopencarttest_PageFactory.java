package decbatch;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class loginopencarttest_PageFactory {

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

String[][] data=new String[4][2];
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
		//pageobjects obj=new pageobjects(driver);
		pagefactory obj=PageFactory.initElements(driver, pagefactory.class);
		obj.clickonmyaccount();
		obj.clickonlogin();
		obj.enterusername(data[i][0]);
		obj.enterpassword(data[i][1]);
		obj.entersubmitbutton();
		obj.close(driver);
		
		
		/*driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(data[i][0]);
		driver.findElement(By.id("input-password")).sendKeys(data[i][1]);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.close();*/
		
		
	}

	}
}
