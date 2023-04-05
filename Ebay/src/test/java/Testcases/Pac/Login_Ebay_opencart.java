package Testcases.Pac;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pageobjects.Pac.Loginpage_POM;
import Pageobjects.Pac.Loginpage_POM_opencart;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Ebay_opencart {
	
	public static void main(String[] args) throws IOException
	{
		
		ExtentHtmlReporter htmlreport=new ExtentHtmlReporter("testcase1.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlreport);
		
				
		
		String projectpath=System.getProperty("user.dir");
		Properties prob=new Properties();
		InputStream input=new FileInputStream("C:\\Saritha\\Saritha\\Batch1\\Ebay\\Configuration\\config.properties");
				prob.load(input);
		String URL=prob.getProperty("url");
		String excelpath=prob.getProperty("inputdatapath");
		
			
				//test.fail("Login failed",MediaEntityBuilder.)
		File excelfile=new File(excelpath);
		FileInputStream fis=new FileInputStream(excelfile);
		
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rowcount=sheet.getPhysicalNumberOfRows();
		
		for(int i=1;i<=rowcount;i++)
		{
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get(URL);
			Loginpage_POM_opencart obj1=new Loginpage_POM_opencart(driver);
		String username=sheet.getRow(i).getCell(0).getStringCellValue();
		String password=sheet.getRow(i).getCell(1).getStringCellValue();
		ExtentTest test=extent.createTest("Valid login with:"+username +"and"+password);
		
		obj1.clickMyaccountlink();
		test.pass("Account link is clicked");
		obj1.clickloginlink();
		test.pass("Login link is clicked");
		obj1.enteremail(username);
		test.pass("User name is entered:"+username);
		obj1.enterpassword(password);
		test.pass("password is entered:"+password);
		obj1.clickonsubmit();
		File ssfile=((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ssfile, new File(projectpath+"\\f1.jpg"));
		
		test.fail("Login Failed",MediaEntityBuilder.createScreenCaptureFromPath("Screen.png")
				.build());
		
		
		
		driver.close();
		
		}
		extent.flush();
		/*driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.id("email")).sendKeys("saritha2k23@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		driver.findElement(By.id("SubmitLogin")).click();
		*/
	}

}
