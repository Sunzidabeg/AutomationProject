package test;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import page.RemoveAllListItemPage;
import util.OpenBrowser;


public class RemoveAllTest extends OpenBrowser {
	RemoveAllListItemPage removeallpage;
	
	
	@Before
	public void setUp() {
		
		init();
		removeallpage = PageFactory.initElements(driver, RemoveAllListItemPage.class);
		
	}
	@Test
	 public void test() throws Exception {
		 
		 removeallpage.clickRemoveButton();
		 Thread.sleep(2000);
		 
		 
	 }
	 @After
		public void tearDown() {		
			driver.close();
			driver.quit();
		}
}