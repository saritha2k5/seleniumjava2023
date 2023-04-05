package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class helloworld {
  @Test
  public void f() {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://demo.opencart.com/");
	  
	  driver.findElement(By.linkText("My Account")).click();
	  driver.findElement(By.linkText("Register")).click();
	  
	  driver.findElement(By.id("input-firstname")).sendKeys("Saritha");
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
  }
}
