package snspanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Basepkg.basequikr;

public class quikr extends basequikr{
	
	@Test
	public void quikrmethod()
	{
//WebElement ele1= dr.findElement(By.xpath("//*[@id='hSelectCity']/span"));
		dr.manage().window().maximize()	;
WebElement el12=dr.findElement(By.xpath("//*[@id='hSelectCity']/span"));
el12.click();
WebElement drpdn=dr.findElement(By.xpath("//a[text()=Ahmedabad]"));
Select obj=new Select(drpdn);
obj.selectByIndex(1);
}
}
