package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenBrowser {

	public static WebDriver driver;

	

	public static WebDriver init() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sunzida\\eclipse-workspaceTF\\Selenium\\pracDemo\\driver86\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;

	}


}
