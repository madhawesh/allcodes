package com.QUTrust2.com.QUTrust2;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePackage.BaseClass;

public class fb {

	// public String baseUrl = "https://www.facebook.com/";
	public WebDriver driver;

	@BeforeTest

	public void launch() {
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void fblogin() {
		driver.manage().window().maximize();
		WebElement uname = driver.findElement(By.id("email"));
		uname.sendKeys("9555586296");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("20081990");

		// WebElement sub= driver.findElement(By.xpath("//*[@id='u_0_u']"));
		WebElement sub = driver.findElement(By.id("u_0_q"));
		sub.click();
        WebElement log = driver.findElement(By.id("userNavigationLabel"));
		log.click();
		WebElement log1=
		driver.findElement(By.xpath("//span[text()='Log Out']"));
		log1.click();
		/*
		  WebDriverWait wait = new WebDriverWait(driver, 20);
		 
		  WebElement element =
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Log Out']")));  //span[text()='Log Out']
		  
		  //(//span[@class='_54nh'])[9]
		   element.click();*/
	//	System.setProperty("webdriver.chrome.driver", "F:\Madhawesh data\MainData\Rama\Webdriver\chromedriver.exe");
		//WebDriver driverChrome = new ChromeDriver();
	//	System.setProperty("webdriver.ie.driver","F:\Madhawesh data\MainData\Rama\Webdriver\IEDriverServer.exe");
	//	driver = new InternetExplorerDriver();
		
	}

}
