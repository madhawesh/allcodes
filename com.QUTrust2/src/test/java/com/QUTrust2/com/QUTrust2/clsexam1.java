package com.QUTrust2.com.QUTrust2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class clsexam1 {

	public WebDriver d1;
	@BeforeTest
	public void stsr()
	{
		d1= new FirefoxDriver();
		d1.get("https://www.google.co.in/");
		
	}
@Test(dataProvider="maddy1")
	
	public void fun1(int x,int y)
	{
		
		
	}
@DataProvider(name="maddy1")
/*public object55[][] dpmethod()
{
String obj[][];	
}*/
  @AfterTest
public void close()
{
	d1.close();
	
}
}
