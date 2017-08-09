package com.QUTrust.QUTrust;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import Basepackage.Baseclass;
import pomClasses.LoginPage;


public class FirstProject extends Baseclass{
	
//    @Test
//    public void verifyHomepageTitle() {
//    	System.out.println("Started the Test case");
//        String expectedTitle = "Welcome: Mercury Tours";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle);
//   }
    
    @Test(priority = 1)
    public void loginValid(){
    	LoginPage lp=new LoginPage(driver);
    	lp.login("Samit.babbar@semusi.com", "samit@12");
    	lp.logout();
    	 
    }
    @Test(priority = 2)
    public void InvalidValid(){
    	LoginPage lp=new LoginPage(driver);
    	lp.login("Samit.babbar@semusi.com", "samit");
    
    }
    
}
