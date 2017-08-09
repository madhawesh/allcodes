package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	//public String baseUrl = "http://admin.qutrust.com/";
	
	//public String baseUrl1 = "https://www.gmail.com";
	public String baseUrl = "https://www.facebook.com/";
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
