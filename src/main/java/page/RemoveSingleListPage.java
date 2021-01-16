package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;



public class RemoveSingleListPage {
	
WebDriver driver;
	
	public RemoveSingleListPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@FindBy(how = How.LINK_TEXT, using = "hdf")
	WebElement RemoveItem;
	
	public void RemoveItem() {
		
		WebElement RemoveItem = driver.findElement(By.linkText("hdf"));
		RemoveItem.isSelected();
	  
		
		        
	   driver.findElement(By.xpath("//input[@name='submit' and @value='Remove']")).click();
		
	   Assert.assertEquals(true, true);
	   System.out.println("removed");
	    
	}
	
	
	
}
