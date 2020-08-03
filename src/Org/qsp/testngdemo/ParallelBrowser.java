package Org.qsp.testngdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelBrowser {
	WebDriver drivere;

	@BeforeMethod
	@Parameters("browser")
	public void bm(String bName) {
		if (bName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\Software\\geckodriver.exe");
			drivere = new FirefoxDriver();
		}
		if (bName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
			drivere = new ChromeDriver();
		}
		drivere.manage().window().maximize();
		drivere.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void m() throws Exception {
		drivere.get("https://www.google.com/");
		Thread.sleep(2000);
		drivere.close();
	}

}
