package firstexcel.excel;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

//import com.gargoylesoftware.htmlunit.javascript.host.file.File;


public class excelloop2 {
WebDriver driver;


@Test
public void fun1() throws FileNotFoundException
{
	//int i=1,j=2,k;
driver=new FirefoxDriver();
driver.get("http://admin.qutrust.com/");
driver.manage().window().maximize();
WebElement web=driver.findElement(By.id("username"));
WebElement web2=driver.findElement(By.id("password"));
WebElement web3=driver.findElement(By.id("submit_button"));
File src= new File("C:\\Users\\madhwesh\\workspace\\excel\\excel\\testdata.xls");
FileInputStream fis=new FileInputStream(src);
HSSFWorkbook wb= new HSSFWorkbook();
HSSFSheet sheet=wb.getSheetAt(0);
int rowlen= sheet.getPhysicalNumberOfRows();


HSSFRow row = sheet.getRow(0);
HSSFCell cell1 = row.getCell(0);
String str1=cell1.getStringCellValue();
System.out.println(str1);

 /*for(int i=0;i<=rowlen;i++)
{
	
HSSFRow row = sheet.getRow(i);
HSSFCell cell1 = row.getCell(0);
String str1=cell1.getStringCellValue();
HSSFCell cell2 = row.getCell(1);
String str2=cell2.getStringCellValue();
web.sendKeys(str1);
web2.sendKeys(str2);

	}   */
}

}
