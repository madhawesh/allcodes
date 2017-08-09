package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PonClass {
WebDriver driver;

    @FindBy (id="username")
    private WebElement un;
    @FindBy (id="password")
    private WebElement pwd;
    @FindBy (id="submit_button")
    private WebElement sub_btn;
    
    public PonClass( WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
    	
    }
    
    public void login(String x, String y)
    {
    	un.sendKeys(x);
    	pwd.sendKeys(y);
    	sub_btn.click();
    	
    	 }

    
}
