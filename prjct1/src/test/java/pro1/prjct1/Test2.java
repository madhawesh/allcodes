package pro1.prjct1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Test2 {
	
	public WebDriver driver;
	


	public void datetime()
	{
	//public WebDriver driver;
	String base= "http://admin.qutrust.com/report";
	driver.get(base);
	WebElement dateWidget = driver.findElement(By.id("startdate")); 
	dateWidget.click();
	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]/span"));
	driver.findElement(By.linkText("22")).click();
	WebElement dateWidget1 = driver.findElement(By.id("enddate")); 
	dateWidget1.click();
	driver.findElement(By.linkText("22")).click();
	driver.findElement(By.id("submit")).click();
	}

}
