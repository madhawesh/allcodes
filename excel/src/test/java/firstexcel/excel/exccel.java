package firstexcel.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class exccel {
	WebDriver driver;

	@Test
	public void fun1() throws Exception {
	
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
		
		WebElement element = driver.findElement(By.xpath("//*[contains(@class,'_1mf _1mj')]//span//br"));
		Actions builder = new Actions(driver);
		//File scr=new File(C:\\Users\\madhwesh\\workspace\\bot\\botexl.xls);

		File src=new File("C:\\Users\\madhwesh\\workspace\\excel\\excel\\testdata.xls");
		FileInputStream fis=new FileInputStream(src);
		//for xls file XSSFworkbook=new XSSFworkbook(fis);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet sheet1=wb.getSheetAt(0);
		String data1=sheet1.getRow(0).getCell(0).getStringCellValue();
		builder.moveToElement(element).click().sendKeys(data1).build().perform();
		//builder.moveToElement(element).sendKeys(Keys.ENTER).build().perform();
		//Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Send']"));
		element2.click();
		//ele2
		Thread.sleep(1000);
		
		WebElement element11 = driver.findElement(By.xpath("//*[contains(@class,'_1mf _1mj')]//span//br"));
		Actions builder1 = new Actions(driver);
		String data2=sheet1.getRow(1).getCell(0).getStringCellValue();
		builder1.moveToElement(element11).click().sendKeys(data2).build().perform();
		//builder.moveToElement(element).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		WebElement element3 = driver.findElement(By.xpath("//a[text()='Send']"));
		element3.click();
		
	//ele2
		Thread.sleep(1000);
		WebElement element111 = driver.findElement(By.xpath("//*[contains(@class,'_1mf _1mj')]//span//br"));
		Actions builder11 = new Actions(driver);
		String data3=sheet1.getRow(2).getCell(0).getStringCellValue();
		builder11.moveToElement(element111).click().sendKeys(data3).build().perform();
		//builder.moveToElement(element).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		WebElement element4 = driver.findElement(By.xpath("//a[text()='Send']"));
		element4.click();
		
		//ele3
		Thread.sleep(1000);
		WebElement element121 = driver.findElement(By.xpath("//*[contains(@class,'_1mf _1mj')]//span//br"));
		Actions builder21 = new Actions(driver);
				String data4=sheet1.getRow(3).getCell(0).getStringCellValue();
				builder21.moveToElement(element121).click().sendKeys(data4).build().perform();
				//builder.moveToElement(element).sendKeys(Keys.ENTER).build().perform();
				Thread.sleep(2000);
				WebElement element5 = driver.findElement(By.xpath("//a[text()='Send']"));
				element5.click();
				//ele3
				Thread.sleep(1000);
				WebElement element1213 = driver.findElement(By.xpath("//*[contains(@class,'_1mf _1mj')]//span//br"));
				Actions builder215 = new Actions(driver);
						String data5=sheet1.getRow(4).getCell(0).getStringCellValue();
						builder215.moveToElement(element1213).click().sendKeys(data5).build().perform();
						//builder.moveToElement(element).sendKeys(Keys.ENTER).build().perform();
						Thread.sleep(2000);
						WebElement element6 = driver.findElement(By.xpath("//a[text()='Send']"));
						element6.click();
		
	
	}

}
