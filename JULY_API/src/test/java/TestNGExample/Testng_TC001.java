package TestNGExample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testng_TC001 {
  @Test(priority=1, enabled=false)
  public void f() {
	  System.out.println("This is the Test");
  }
  
  @Test(priority=0)
  public void test5()
  {
	 System.out.println("This is Test5");
	 
  }
  @Test(priority=1)
  public void test2()
  {
	 System.out.println("This is Test2");
	 
  }
  @Test(priority=3)
  public void test3()
  {
	 System.out.println("This is Test3");
	 
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is After method");
  }


 
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	 System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("After Suite");
  }

}
