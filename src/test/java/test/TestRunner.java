package test;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import page.CheckBox;
import util.OpenBrowser;



public class TestRunner extends OpenBrowser {
	CheckBox checkboxobj;
	
	@Before
	public void setUp() {
		init();
		checkboxobj = PageFactory.initElements(driver,CheckBox.class);
		
	}

	@Test
	public void loginTest() throws Throwable {
		checkboxobj.clickCheckButton();
		
		Thread.sleep(2000);
		
	
	}
		
	@After
	public void tearDown() {		
		driver.close();
		driver.quit();
	}

}




