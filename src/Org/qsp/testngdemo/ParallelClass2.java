package Org.qsp.testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelClass2 {
	@Test
	public void m2() {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.close();
		System.out.println("Two");
	}

}
