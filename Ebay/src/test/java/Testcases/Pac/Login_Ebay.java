package Testcases.Pac;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pageobjects.Pac.Loginpage_POM;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Ebay {
	
	public static void main(String[] args) throws IOException
	{
		
		
		
		
		File excelfile=new File("C:\\Saritha\\Saritha\\Batch1\\Ebay\\Testdata\\logindata.xlsx");
		FileInputStream fis=new FileInputStream(excelfile);
		
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rowcount=sheet.getPhysicalNumberOfRows();
		
		for(int i=1;i<=rowcount;i++)
		{
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.opencart.com/");
			Loginpage_POM obj1=new Loginpage_POM(driver);
		String username=sheet.getRow(i).getCell(0).getStringCellValue();
		String password=sheet.getRow(i).getCell(1).getStringCellValue();
		
		obj1.clicksigninlink();
		obj1.enteremail(username);
		obj1.enterpassword(password);
		obj1.clickonsubmit();
		
		driver.close();
		
		}
		/*driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.id("email")).sendKeys("saritha2k23@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		driver.findElement(By.id("SubmitLogin")).click();
		*/
	}

}
