package test;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import page.RemoveSingleListPage;
import util.OpenBrowser;

public class RemoveSingleListTest extends OpenBrowser {
	RemoveSingleListPage removesingleitempage;

	@Before
	public void setUP() {
		init();
		removesingleitempage = PageFactory.initElements(driver, RemoveSingleListPage.class);

	}

	@Test
	public void test() throws Exception {

		removesingleitempage.RemoveItem();

		Thread.sleep(2000);

	}
		

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
