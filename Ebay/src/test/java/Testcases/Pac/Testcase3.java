package Testcases.Pac;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase3 {

	public static void main(String[] args) throws IOException {
		
		String projectpath=System.getProperty("user.dir");
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		ExtentHtmlReporter htmlreporter=new ExtentHtmlReporter("TC002.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlreporter);
			ExtentTest test=extent.createTest("My First Testcase", "Sample Description");
			test.log(Status.INFO, "This step shows usage of logs(ststus,detail)");
			test.info("This test show the usage of info");
			test.pass("Login successfull");
			
			File ssfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ssfile, new File(projectpath+"\\errormessage.jpg"));
			
			test.fail("Login failed",
					MediaEntityBuilder.createScreenCaptureFromPath("errormessage.jpg")
					.build());
			
			extent.flush();

	}

}
