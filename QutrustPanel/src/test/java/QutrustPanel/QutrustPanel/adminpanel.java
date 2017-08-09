package QutrustPanel.QutrustPanel;

import java.io.IOException;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.bcel.classfile.Utility;
import org.apache.commons.collections.FactoryUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import Baseclass.baseclass;
import junit.framework.Assert;

public class adminpanel  {

WebDriver d1;
@Test
public void captureScreenshot() throws Exception{
	
	d1= new FirefoxDriver();	
	d1.get("http://localhost:8012/gulp-project/Multihub/easyservice.php");
	d1.findElement(By.xpath("//*[@id='success']"));
}
@AfterMethod
public void fun1(ITestResult result)
{
	if(ITestResult.FAILURE== result.getStatus())
	{
	//Utility.captureScreenshot(d1,result.getName());
	}

}
}

