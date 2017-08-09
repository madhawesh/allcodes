package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Baseclass {

	public String baseUrl = "http://sales.syncnscan.com.au";
    public WebDriver driver ; 
    
	@BeforeTest
	  public void launchBrowser() {
		//ProfilesIni profile = new ProfilesIni();
		//FirefoxProfile myprofile = profile.getProfile("maddyprofile");
		
			driver=new FirefoxDriver();
	        driver.get(baseUrl);
	    
	      }
	@AfterTest
	  public void CloseBrowser() {
		  
        driver.close();
       
      }
}
