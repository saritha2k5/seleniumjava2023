package marchbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.opencart.pageobjects.pagefactory1;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_Pagafactory_TestNG {

	@Test
	public void testcase1() {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		pagefactory1 obj=PageFactory.initElements(driver,pagefactory1.class);
		
		driver.get("https://demo.opencart.com/");
		obj.clickonmyaccount();
		obj.clickonloginlink();
		obj.enteremail();
		obj.enterpassword();
		obj.clickonsubmit();
		
		
		/*driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys("marchbatch@gmail.com");
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys("welcome");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		*/
	}

}
