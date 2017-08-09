package pro1.prjct1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest

{
 public WebDriver driver;

 @BeforeTest
 public void launch() {
  System.setProperty("webdriver.gecko.driver", "E:/Work_Space/geckodriver-v0.14.0-win64/geckodriver.exe");
  driver = new FirefoxDriver();
  driver.navigate().to("http://admin.qutrust.com/report");
 }

 @Test
 public void test1() throws Exception {
//  String Act = "QuTrust Admin Panel";
  try {
  
  } catch (Exception e) {
   String Act1 = "QuTrust Admin Panell";
   Assert.assertEquals(driver.getTitle(), Act1);
   System.out.println(driver.getTitle());
   getscreenshot();
  }

 }

 @AfterTest
 public void exit() {
  driver.close();

 }

 public void getscreenshot() throws Exception {
  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
  // The below method will save the screen shot in d drive with name
  // "screenshot.png"
  FileUtils.copyFile(scrFile, new File("E:\\Screenshots\\screenshot.png"));
 }

}