package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class test1 {

	public static void main(String[] args) {

WebDriver dd= new FirefoxDriver();
dd.get("http://localhost:8012/gulp-project/Multihub/easyservice.php");

System.out.println(dd.getTitle() );
String Exp= "Easyservice mobile diagnostic";
String Act=dd.getTitle();
String Act1="HI";
Assert.assertEquals(Exp,Act1,"Test passed");
System.out.println("Test passed");
/*if(Assert.assertEquals(Exp,Act1))
	
{
System.out.println("Test passed");	
}
else{
	System.out.println("Failed");	
}*/
dd.close();
	}


}
