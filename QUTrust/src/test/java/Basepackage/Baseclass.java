package Basepackage;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import junit.framework.Assert;

public class Baseclass {
	  // public String baseUrl = "http://newtours.demoaut.com/";
	   // String driverPath = "C:\\geckodriver.exe";
	
	public String baseUrl = "http://stagingadmin.qutrust.com/";
	    public WebDriver driver ; 
	    
	  @BeforeTest
	  
      public void launchBrowser() {
		  
		driver=new FirefoxDriver();
       //   System.out.println("launching firefox browser"); 
     //     System.setProperty("webdriver.firefox.marionette", driverPath);
        driver.get(baseUrl);
       
      }
	  
  
      
//      @AfterTest
//      public void terminateBrowser(){
//          driver.close();
//      }
}
