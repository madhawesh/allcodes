package Baseclass;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class baseclass {
	
	public WebDriver d1;
	String base= "http://admin.qutrust.com/report";
	
	@BeforeTest
	public void before()
	{
		d1=new FirefoxDriver();
		d1.get(base);
		
	}
	
	@AfterTest
	public void after()
	{
		d1.close();
	}

}
