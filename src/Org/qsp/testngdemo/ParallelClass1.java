package Org.qsp.testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelClass1 {

	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.close();
		System.out.println("One");
	}

}
