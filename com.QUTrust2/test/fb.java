package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class fb {
	public WebDriver driver;
	String base= "https://www.facebook.com/";
	
  @Test
  public void f() {
  }
  @BeforeTest
	public void launch()
	{
		driver= new FirefoxDriver();
		driver.navigate().to(base);
		
	}

  @AfterTest
  public void afterTest() {
  }

}
