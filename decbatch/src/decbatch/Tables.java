package decbatch;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Saritha\\Saritha\\HCL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				Thread.sleep(60);
				driver.findElement(By.xpath("//input[@name='username']")).clear();
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
				driver.findElement(By.name("password")).clear();
				
				driver.findElement(By.name("password")).sendKeys("admin123");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
	
	driver.close();
	}
	
}
				
				
				