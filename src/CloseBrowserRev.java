
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowserRev {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();// maximizing browser
		driver.get("https://www.naukri.com/"); // loading url
		String parent = driver.getWindowHandle();// parent window handle
		System.out.println("Parent window handle :" + parent);
		Thread.sleep(5000);
		Set<String> windows = driver.getWindowHandles();

		List<String> lst = new ArrayList<String>(windows);
		for (int i = lst.size() - 1; i >= 0; i--) {
			String win = lst.get(i);
			driver.switchTo().window(win);
			Thread.sleep(2000);
			driver.close();
		}
	}

}
