import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("java", Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement next = driver.findElement(By.xpath("//a[@id=\"pnnext\"]/descendant::span[contains(.,'Next')]"));
		Thread.sleep(1000);
		while (next.isDisplayed()) {
			next.click();
			next = driver.findElement(By.xpath("//a[@id=\"pnnext\"]/descendant::span[contains(.,'Next')]"));
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			if (!next.isDisplayed())
				break;
			next = driver.findElement(By.xpath("//a[@id=\"pnnext\"]/descendant::span[contains(.,'Next')]"));
			Thread.sleep(1000);
		}
	}

}
