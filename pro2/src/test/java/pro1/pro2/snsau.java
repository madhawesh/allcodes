package pro1.pro2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class snsau {
WebDriver driver;

@Test(priority=1)
public void fun1() throws Exception
{
	driver=new FirefoxDriver();
	driver.get("http://www.syncnscan.com.au/");
	driver.manage().window().maximize();
	WebElement element1=driver.findElement(By.xpath("//button[text()='SHOW MY PLAN']"));
	element1.click();
	WebElement element2=driver.findElement(By.xpath("//a[@id='control-panel-0']"));
	WebElement element3=driver.findElement(By.linkText("Quick Links"));
	element3.click();
	Actions builder1 = new Actions(driver);

	Thread.sleep(2000);
	builder1.moveToElement(element2).click().build().perform();

}

}
