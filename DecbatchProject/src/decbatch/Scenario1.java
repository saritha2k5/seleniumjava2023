package decbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Saritha\\Saritha\\HCL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				driver.get("https://demo.opencart.com/");
				System.out.println("Title is:"+driver.getTitle());
driver.manage().window().maximize();
				WebElement ele=driver.findElement(By.linkText("My Account"));
				ele.click();
driver.findElement(By.linkText("Login")).click();
driver.findElement(By.id("input-email")).clear();
driver.findElement(By.id("input-email")).sendKeys("saritha@gmail.com");
driver.findElement(By.id("input-password")).clear();
driver.findElement(By.id("input-password")).sendKeys("welcome");
driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.close();

				
				
	}

}
