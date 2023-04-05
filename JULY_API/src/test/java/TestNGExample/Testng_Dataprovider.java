package TestNGExample;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
public class Testng_Dataprovider {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println("The valus of the integer is:"+n);
	  System.out.println("The valus of the String is:"+s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "c" },
    };
  }
}
