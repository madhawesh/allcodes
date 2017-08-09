package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class basequikr {
	
	public WebDriver dr;
	public String base= "http://www.quikr.com/";
	@BeforeTest
public void launch(){
		dr=new FirefoxDriver();
		dr.get(base);
	}
	
	@AfterTest
	public void exit()
	{
		dr.close();
		
	}
}
