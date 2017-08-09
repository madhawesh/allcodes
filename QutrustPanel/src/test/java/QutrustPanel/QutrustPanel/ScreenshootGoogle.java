package QutrustPanel.QutrustPanel;

import java.io.File;

import java.io.IOException;
 
import org.apache.commons.io.FileUtils;
 
import org.openqa.selenium.OutputType;
 
import org.openqa.selenium.TakesScreenshot;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.testng.annotations.Test;

public class ScreenshootGoogle {
		 WebDriver driver;
		@Test
		public void TestJavaS1() throws InterruptedException{
		 
		 // Open Firefox
		  driver=new FirefoxDriver();
		 
		// call method
		                      //  ScreenshootGoogle.captureScreenShot(driver);
		 
		// Maximize the window
		driver.manage().window().maximize();
		                        //ScreenshootGoogle.captureScreenShot(driver);
		 
		// Pass the url
		driver.get("http://www.google.com");
		//https://www.facebook.com/
		//http://www.google.com
		                  ScreenshootGoogle.captureScreenShot(driver);
		 
		  }
		 
		public static void captureScreenShot(WebDriver ldriver) throws InterruptedException{
		// Take screenshot and store as a file format  
			Thread.sleep(20000);
		 File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);           
		try {
		// now copy the  screenshot to desired location using copyFile method
		 
		FileUtils.copyFile(src, new File("C:/Users/madhwesh/workspace/QutrustPanel/screenshot/"+System.currentTimeMillis()+".png"));                              } catch (IOException e)
		 
		{
		  System.out.println(e.getMessage()) ;
		 }
		  }
	
		}

