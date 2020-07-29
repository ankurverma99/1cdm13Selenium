import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();// maximizing browser
		driver.get("https://www.naukri.com/"); // loading url
		String parent = driver.getWindowHandle();// parent window handle
		System.out.println("Parent window handle :" + parent);
		Thread.sleep(5000);
		Set<String> windows = driver.getWindowHandles();
		windows.remove(parent);
		for (String win : windows) {
			System.out.println("Child and Parent window handle :" + win);
			driver.switchTo().window(win);
			driver.close();
		}
	}

}
