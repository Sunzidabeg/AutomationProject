package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import util.OpenBrowser;

public class CheckBox extends OpenBrowser {
	
	WebDriver driver;

	public CheckBox(WebDriver driver) {
		this.driver = driver;
		
	}

		
    @FindBy(how = How.XPATH, using = "allbox")
	WebElement clickCheckButton;
    
   
	public void clickCheckButton() {
		
			
		WebElement clickCheckButton = driver.findElement(By.name("allbox"));
		clickCheckButton.click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		System.out.println("true"); 
	


}


	
}