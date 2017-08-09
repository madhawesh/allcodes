package pro1.pro2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Baseclasss {
	
	public WebDriver d1;
	
	@BeforeTest
	public void beforezClass(){
	d1= new FirefoxDriver();
	d1.get("http://admin.qutrust.com/report");
	}
	
	
	@AfterClass
	public void close(){
		d1.close();
	}
}

