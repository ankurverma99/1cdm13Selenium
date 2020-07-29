import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		/*
		 * js.executeScript("window.scrollBy(800,0)"); Thread.sleep(2000);
		 * js.executeScript("window.scrollBy(-300,0)");
		 */
		js.executeScript("window.scrollTo(document.body.scrollWidth,0)");

	}

}
