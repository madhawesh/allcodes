package pro1.pro2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class test2 {
	@Test(priority=1)
	 public void f1() throws InterruptedException{
		  // TODO Auto-generated method stub
		FirefoxDriver dr1= new FirefoxDriver();
		dr1.get("http://admin.qutrust.com/easyservice");
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
		//dr1.get("http://admin.qutrust.com/easyservic");
	
		//WebDriverWait wait=new WebDriverWait(dr1, 20);
		WebElement search=dr1.findElement(By.id("searchquery"));
		search.sendKeys("Easy Service");
		WebElement radio=dr1.findElement(By.id("clientname"));
		radio.click();
		//DateFormat dateFormat2 = new SimpleDateFormat("dd"); 
		//Date date2 = new Date(0);

		//String today = dateFormat2.format(date2); 

		//find the calendar
		Thread.sleep(3000);
		WebElement dateWidget = dr1.findElement(By.id("startdate")); 
		dateWidget.click();
		dr1.findElement(By.linkText("27")).click();
		WebElement dateWidget1 = dr1.findElement(By.id("enddate")); 
		dateWidget1.click();
		dr1.findElement(By.linkText("28")).click();
		 dr1.findElement(By.id("submit")).click();
	    dr1.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	//	 WebElement report = dr1.findElement(By.id("export")); 
		// report.click();
		// Alert alert = dr1.switchTo().alert();
		// alert.accept();
	//	 WebElement navigationclick = dr1.findElement(By.className("btnbtn-default"));
		// navigationclick.click();
		// dr1.findElement(By.className("btnbtn-default")).click();
	}	 
	
	@Test(priority=2)
		 public void f2() {
			  // TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "F:\\Madhawesh data\\MainData\\Rama\\Webdriver\\chromedriver.exe");
			WebDriver dr1 = new ChromeDriver();
			dr1.get("http://admin.qutrust.com/easyservice");
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
			//dr1.get("http://admin.qutrust.com/easyservic");
		
			//WebDriverWait wait=new WebDriverWait(dr1, 20);
			WebElement search=dr1.findElement(By.id("searchquery"));
			search.sendKeys("Easy Service");
			WebElement radio=dr1.findElement(By.id("clientname"));
			radio.click();
			//DateFormat dateFormat2 = new SimpleDateFormat("dd"); 
			//Date date2 = new Date(0);

			//String today = dateFormat2.format(date2); 

		
			//find the calendar
			WebElement dateWidget = dr1.findElement(By.id("startdate")); 
			dateWidget.click();
			dr1.findElement(By.linkText("27")).click();
			WebElement dateWidget1 = dr1.findElement(By.id("enddate")); 
			dateWidget1.click();
			dr1.findElement(By.linkText("28")).click();
			 dr1.findElement(By.id("submit")).click();
		    dr1.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
			// WebElement report = dr1.findElement(By.id("export")); 
			// report.click();
			// Alert alert = dr1.switchTo().alert();
			// alert.accept();
		//	 WebElement navigationclick = dr1.findElement(By.className("btnbtn-default"));
			// navigationclick.click();
			// dr1.findElement(By.className("btnbtn-default")).click();
}
	
	@Test(priority=3)
	 public void f3() throws InterruptedException {
		  // TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","F:\\Madhawesh data\\MainData\\Rama\\Webdriver\\IEDriverServer.exe");
		WebDriver dr1 = new InternetExplorerDriver();
		dr1.get("http://admin.qutrust.com/report");
		Thread.sleep(5000);
		String s1 = "";
		s1=dr1.getTitle();
		System.out.println(s1+"Automation testing starts now");
		//public Selenium selenium;
		//selenium.waitForPageToLoad("300000000");
		//dr1.manage().window().maximize();
		// dr1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	//	Thread.sleep(10000);
		WebElement email=dr1.findElement(By.id("username"));
		email.sendKeys("Samit.babbar@semusi.com");
		WebElement pwd=dr1.findElement(By.id("password"));
		pwd.sendKeys("samit@12");
		dr1.findElement(By.id("submit_button")).click();
		//dr1.close();
		//FirefoxDriver dr1= new FirefoxDriver();
		//dr1.get("http://admin.qutrust.com/easyservic");
	
		//WebDriverWait wait=new WebDriverWait(dr1, 20);
		WebElement search=dr1.findElement(By.id("searchquery"));
		search.sendKeys("Easy Service");
		WebElement radio=dr1.findElement(By.id("clientname"));
		radio.click();
		//DateFormat dateFormat2 = new SimpleDateFormat("dd"); 
		//Date date2 = new Date(0);

		//String today = dateFormat2.format(date2); 

		//find the calendar
		WebElement dateWidget = dr1.findElement(By.id("startdate")); 
		dateWidget.click();
		dr1.findElement(By.linkText("27")).click();
		WebElement dateWidget1 = dr1.findElement(By.id("enddate")); 
		dateWidget1.click();
		dr1.findElement(By.linkText("28")).click();
		 dr1.findElement(By.id("submit")).click();
	    dr1.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		// WebElement report = dr1.findElement(By.id("export")); 
		// report.click();
		// Alert alert = dr1.switchTo().alert();
		// alert.accept();
	//	 WebElement navigationclick = dr1.findElement(By.className("btnbtn-default"));
		// navigationclick.click();
		// dr1.findElement(By.className("btnbtn-default")).click();
}
}
