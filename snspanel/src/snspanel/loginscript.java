package snspanel;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import Basepkg.Baseclass;

public class loginscript extends Baseclass {

@Test
public void f1() throws InterruptedException
{
	driver.manage().window().maximize();
	WebElement email=driver.findElement(By.id("username"));
	email.sendKeys("admin@syncnscan.com.au");
	WebElement pwd=driver.findElement(By.id("password"));
	pwd.sendKeys("123456");
	driver.findElement(By.id("submit_button")).click();
	 // Thread.sleep(2000);
	//Dropdown code starts here
	WebElement drpdn=driver.findElement(By.id("sel1"));
     Select obj=new Select(drpdn);
    // obj.selectByValue("Last Week");
     obj.selectByIndex(4);
     Thread.sleep(1000);
     System.out.println("entering 4");
     WebElement var1=driver.findElement(By.xpath("//*[@id='payudata']/tr[1]"));
    
   
     //  if(var1 >= 1){
     System.out.println( var1.getSize()); 
    
     obj.selectByIndex(3);
     Thread.sleep(1500);
     System.out.println("entering 3");
     obj.selectByIndex(2);
     Thread.sleep(1500);
     System.out.println("entering 2");
     obj.selectByIndex(1);
     Thread.sleep(1500);
     System.out.println("entering 1");
     obj.selectByIndex(0);
     Thread.sleep(1500);
     System.out.println("entering 0");
    
 
  // Create object of SimpleDateFormat class and decide the format
     //code for getting current date
     DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
     
     //get current date time with Date()
     Date date = new Date();
     
     // Now format the date
     String date1= dateFormat.format(date);
    // String date2=dateFormat.format(date-7);
     // Print the Date
     System.out.println("Todays date is:"+date1);
     obj.selectByIndex(5);
     Thread.sleep(1000);
     //acieve curr date-7 in start date
    // int stdate= 04/24/2017;
     WebElement startdate=driver.findElement(By.id("startdate"));
     startdate.sendKeys("04/24/2017");
     WebElement enddate=driver.findElement(By.id("enddate"));
     enddate.sendKeys(date1);
     WebElement sub=driver.findElement(By.id("submit"));
     sub.click();
     //code for taking screenshot
   
     Thread.sleep(2000);
}
}
