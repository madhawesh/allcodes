package restful.restful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class chekrestapi {
WebDriver driver;
	
	
	@Test
	public void rest()
	{
		driver= new FirefoxDriver();
		//driver.navigate().to("chrome://restclient/content/restclient.html");
		driver.get("chrome://restclient/content/restclient.html");
		
	}
}
