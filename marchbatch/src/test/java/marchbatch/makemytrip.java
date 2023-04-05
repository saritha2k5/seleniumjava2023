package marchbatch;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemytrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(50);
		driver.findElement(By.linkText("Hotels")).click();
		driver.findElement(By.id("hsw_search_button")).click();
		Thread.sleep(60);
		driver.findElement(By.xpath("//input[@placeholder='Search for locality / hotel name']")).sendKeys("Goa");
	WebElement ele=driver.findElement(By.linkText("South Goa, Goa"));
	Actions builder=new Actions(driver);
	builder.moveToElement(ele).perform();
	ele.click();
	driver.findElement(By.id("hlistpg_hotel_name")).click();
	List<String> l1=new ArrayList<String>(driver.getWindowHandles());
System.out.println(l1.size());
	driver.switchTo().window(l1.get(1));
	System.out.println("Windws:"+driver.getCurrentUrl());
	
	driver.findElement(By.linkText("BOOK THIS NOW")).click();
	}

}
