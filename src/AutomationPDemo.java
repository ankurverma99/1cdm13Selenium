import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationPDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement dress = driver.findElement(By.xpath(
				"//ul[@class=\"sf-menu clearfix menu-content sf-js-enabled sf-arrows\"]/li/a[@title='Dresses']"));
		Actions a = new Actions(driver);
		a.moveToElement(dress).perform();
		driver.findElement(By.xpath(
				"//ul[@class=\"submenu-container clearfix first-in-line-xs\"]/li/a[contains(.,'Casual Dresses')]"))
				.click();
		driver.findElement(By.xpath("//div[@class=\"left-block\"]")).click();
		driver.findElement(By.xpath("//span[contains(.,'Add to cart')]")).click();
		driver.findElement(By.xpath("//span[contains(.,'Proceed to checkout')]")).click();
		driver.findElement(By.xpath(
				"//a[@class=\"button btn btn-default standard-checkout button-medium\"]/span[contains(.,'Proceed to checkout')]"))
				.click();
		driver.findElement(By.xpath("//input[@id=\"email_create\"]")).sendKeys("asdfgh");
		driver.findElement(By.xpath("//button[@id=\"SubmitCreate\"]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id=\"create_account_error\"]")).getText());
	}

}
