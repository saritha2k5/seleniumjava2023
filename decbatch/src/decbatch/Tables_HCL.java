package decbatch;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tables_HCL {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Saritha\\Saritha\\HCL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				driver.get("https://app.e-box.co.in/uploads/EventsTable.html");
			for(int i=2;i<=8;i++)
				{
					
				//String i;
				for(int j=1;j<=4;j++)
				{
				System.out.println("Table values are:"+driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td["+ j + "]")).getText());
				
				
				}
				}
				
				//}
				
	
	driver.close();
	}
	
}
				
				
				