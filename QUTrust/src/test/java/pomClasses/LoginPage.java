package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement un;
	@FindBy(id = "password")
	private WebElement pw;
    @FindBy (id="submit_button")
    private WebElement sb;
    
    @FindBy (xpath="//button[text()='Logout']")
    private WebElement lo;
    
	public LoginPage(WebDriver driver) {
    	this.driver = driver;
        // This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
	
	public void login(String uname, String pword){
		un.sendKeys(uname);
		pw.sendKeys(pword);
		sb.click();
	}
	public void logout(){
		lo.click();
		
	}

}
