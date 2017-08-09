package bot.bot;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class botclass {
WebDriver driver;

@Test
public void fun1() throws InterruptedException
{
driver=new FirefoxDriver();	
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.messenger.com/");
//maximise browser
driver.manage().window().maximize();
WebElement str1= driver.findElement(By.id("email"));   
str1.sendKeys( "9555586296");;

WebElement str2= driver.findElement(By.id("pass"));
str2.sendKeys("20081990");
WebElement submit= driver.findElement(By.id("loginbutton"));
submit.click();
Thread.sleep(2000);

//driver.findElement(By.xpath("//*[contains(@type,'sub')].//*[@id='cch_f2115553e58c318']/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/div[2]/div/div/div/div")).sendKeys("HIII");
//Thread.sleep(2000);
//str4.click();
//driver.findElement(By.xpath("//*[contains(@id,'cch_f2115553e58c318')]")).sendKeys("hii");;
//WebElement textfld= driver.findElement(By.xpath("//*[contains(@class,'_1mf _1mj')]"));
//textfld.click();
//textfld.sendKeys("good evening");

//sendKeys("hii");;
//driver.findElement(By.xpath("//*[contains(@class,'_1mf _1mj')]")).click();

//driver.findElement(By.xpath("//*[@id='row_header_id_user:904726629629944']/a/div[2]/div[2]/span/span[2]")).click();
WebElement element = driver.findElement(By.xpath("//*[contains(@class,'_1mf _1mj')]//span//br"));
Actions builder = new Actions(driver);
//File scr=new File(C:\\Users\\madhwesh\\workspace\\bot\\botexl.xls);

builder.moveToElement(element).click().sendKeys("33").build().perform();
//builder.moveToElement(element).sendKeys(Keys.ENTER).build().perform();
Thread.sleep(2000);
WebElement element2 = driver.findElement(By.xpath("//a[text()='Send']"));
element2.click();
WebElement element3 = driver.findElement(By.xpath("//*[@id='js_6kz']/div/span"));
String text1=element3.getText();
System.out.println(text1);



//driver.findElement(By.xpath("//*[contains(@data-offset-key,'4ftp5-0-0')]")).sendKeys("hii");;
//driver.findElement(By.xpath("//*[contains(@data-offset-key,'4ftp5-0-0')]")).sendKeys("hii");;
//WebElement textfld= driver.findElement(By.xpath("//*[@id='js_mz']/div/span/span"));
//String str11=textfld.getText();
//System.out.println(str11);
//*[@id='js_mz']/div/span/span
//driver.close();
// //span[@data-offset-key='8ndde-0-0']/..//br[@data-text='true']
}
}



