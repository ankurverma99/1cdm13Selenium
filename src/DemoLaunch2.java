import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();// maximizing browser
		driver.get("https://www.google.com/"); // loading url
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("=====> " + driver.getTitle());
		System.out.println("Current URL is : " + driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
	}

}
