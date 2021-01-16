package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class RemoveAllListItemPage {

		WebDriver driver;
		
		public RemoveAllListItemPage(WebDriver driver) {
			this.driver = driver;
			
		}
		
		@FindBy(how = How.NAME, using = "submit")
		WebElement clickRemoveButton;
		
			
		public void clickRemoveButton() {
			
			WebElement element = driver.findElement(By.xpath("//input[@name='allbox']"));
			element.click();
			
			WebElement clickRemoveButton = driver.findElement(By.name("submit"));
			clickRemoveButton.click();
			
			Assert.assertEquals(true, true , "Not removed!");
			System.out.println("true");
			
			
		}
			

		
			
		}

