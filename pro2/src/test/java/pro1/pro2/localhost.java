package pro1.pro2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class localhost {

	public WebDriver dr1;
	
/*	@Test(priority=1)
	 public void f1() throws InterruptedException{
		  // TODO Auto-generated method stub
		FirefoxDriver dr1= new FirefoxDriver();
		dr1.get("http://localhost:8012/gulp-project/Multihub/easyservice.php");
		dr1.navigate().refresh();
		//Thread.sleep(3000);
		dr1.manage().window().maximize();
		WebElement succ=dr1.findElement(By.id("success"));
		succ.click();
		//Thread.sleep(10000);
		 dr1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement unin=dr1.findElement(By.id("uninstall"));
		Thread.sleep(1000);
		unin.click();
		
	}*/
	@Test(priority=2)
	public void f2() throws InterruptedException
	{
		for(int i=1;i<=5;i++)
		{
		System.setProperty("webdriver.chrome.driver", "F:\\Madhawesh data\\MainData\\Rama\\Webdriver\\chromedriver.exe");
			WebDriver dr1 = new ChromeDriver();
			dr1.get("http://localhost:8012/gulp-project/Multihub/easyservice.php");
			dr1.navigate().refresh();
			//Thread.sleep(3000);
			dr1.manage().window().maximize();
			WebElement succ=dr1.findElement(By.id("success"));
			succ.click();
			//Thread.sleep(10000);
			 dr1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			WebElement unin=dr1.findElement(By.id("uninstall"));
			Thread.sleep(1000);
			unin.click();
			System.out.print("The value of i is:"+i);
			dr1.close();
		}
	}
	
	
}
