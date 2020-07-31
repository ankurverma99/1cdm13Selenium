package Org.qsp.testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoGecko {
	@Test
	public void m() {
		System.setProperty("webdriver.gecko.driver", ".\\Software\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

}
