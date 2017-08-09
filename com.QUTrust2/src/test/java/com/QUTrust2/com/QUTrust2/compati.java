package com.QUTrust2.com.QUTrust2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class compati {
	public WebDriver d1;
	
	/*@Test(priority=2)
	public void chrome()
	{
		System.out.println("2");
    System.setProperty("webdriver.chrome.driver", "F:\\Madhawesh data\\MainData\\Rama\\Webdriver\\chromedriver.exe");
	WebDriver d1 = new ChromeDriver();
	d1.get("https://www.facebook.com/");
		
	}*/
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.ie.driver","F:\\Madhawesh data\\MainData\\Rama\\Webdriver\\IEDriverServer.exe");
		d1 = new InternetExplorerDriver();
		//d1.get("https://www.facebook.com/");
		d1.get("https://www.facebook.com/");
		http://localhost:8012/gulp-project/Multihub/easyservice.php
		d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test(priority=1)
	public void ie()
	{
		
	}
	
	/*@AfterTest
	public void close(){
		d1.quit();
	}*/
}
