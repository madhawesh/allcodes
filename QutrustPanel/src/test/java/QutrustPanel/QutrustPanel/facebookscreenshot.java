package QutrustPanel.QutrustPanel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class facebookscreenshot {

	WebDriver driver;
	@Test
	public void start()
	{
		
		driver= new FirefoxDriver();
		driver.get("http://admin.qutrust.com/report");
		driver.findElement(By.id("searchquery1"));
		//facebookscreenshot.captureshot(driver);
	}
	public void captureshot(WebDriver ldriver) throws IOException
	{
		File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);           
		FileUtils.copyFile(src, new File("C:/Users/madhwesh/workspace/QutrustPanel/screenshot/"+System.currentTimeMillis()+".png"));
	}
}
