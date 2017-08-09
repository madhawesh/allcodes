package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public WebDriver driver;
	String base= "http://admin.qutrust.com/report";
	
	@BeforeTest
	
	public void launch()
	{
		driver= new FirefoxDriver();
		driver.navigate().to(base);
		
	}
	@AfterTest
	public void exit()
	{
		driver.close();
		
	}
}
