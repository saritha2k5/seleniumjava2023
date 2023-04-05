package decbatch;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Saritha\\Saritha\\HCL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				driver.get("https://demo.opencart.com/");
				driver.manage().window().maximize();
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
				System.out.println("Title in get:"+driver.getTitle());
				System.out.println("Get Class:"+driver.getClass());
				System.out.println("Get Current URL:"+driver.getCurrentUrl());
				//System.out.println("Get Page Source:"+driver.getPageSource());
				System.out.println("Get Text:"+driver.findElement(By.linkText("My Account")).getText());
				System.out.println("Get Attribute:"+driver.findElement(By.linkText("My Account")).getAttribute("class"));
				driver.navigate().to("https://www.google.com/");
				

				System.out.println("Title is navigate to:"+driver.getTitle());
				driver.navigate().back();
				System.out.println("Title in back:"+driver.getTitle());
				driver.navigate().forward();
				System.out.println("Title in forward:"+driver.getTitle());
				driver.navigate().refresh();
				


driver.close();

				
				
	}

}
