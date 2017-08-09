package testjava;
import java.awt.List;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.Selenium;

public class first {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
FirefoxDriver dr1= new FirefoxDriver();
dr1.get("http://stagingadmin.qutrust.com");
String s1 = "";
s1=dr1.getTitle();
System.out.println(s1+"Automation testing starts now");
//public Selenium selenium;
//selenium.waitForPageToLoad("300000000");
dr1.manage().window().maximize();
WebElement email=dr1.findElement(By.id("username"));
email.sendKeys("Samit.babbar@semusi.com");
WebElement pwd=dr1.findElement(By.id("password"));
pwd.sendKeys("samit@12");
dr1.findElement(By.id("submit_button")).click();
//dr1.close();
//FirefoxDriver dr1= new FirefoxDriver();
dr1.get("http://stagingadmin.qutrust.com/report");
WebElement search=dr1.findElement(By.id("searchquery"));
search.sendKeys("9998778");
WebElement radio=dr1.findElement(By.id("validationcode"));
radio.click();
DateFormat dateFormat2 = new SimpleDateFormat("dd"); 
Date date2 = new Date(0);

String today = dateFormat2.format(date2); 

//find the calendar
WebElement dateWidget = dr1.findElement(By.id("startdate")); 
dateWidget.click();
dr1.findElement(By.linkText("22")).click();
WebElement dateWidget1 = dr1.findElement(By.id("enddate")); 
dateWidget1.click();
dr1.findElement(By.linkText("22")).click();
 dr1.findElement(By.id("submit")).click();

 WebElement navigationclick = dr1.findElement(By.className("btnbtn-default"));
 navigationclick.click();
 dr1.findElement(By.className("btnbtn-default")).click();
/* List <WebElement> columns=dr1.findElements(By.tagName("td"));
//comparing the text of cell with today's date and clicking it.
for (WebElement cell : columns)
{
   if (cell.getText().equals(23))
   {
      cell.click();
      break;
   }
}
 */
//dr1.close();
 }

}