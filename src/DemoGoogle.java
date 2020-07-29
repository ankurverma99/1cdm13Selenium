import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoGoogle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/images/WebDriverWait%20Examples/ButtonClick.html");
		WebElement btn = driver.findElement(By.id("otherBtn"));
		WebDriverWait ww = new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.elementToBeClickable(btn));
		btn.click();

	}

}
