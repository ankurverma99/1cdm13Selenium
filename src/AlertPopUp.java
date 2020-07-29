import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// constructor overloading
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v1/index.php");
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(a.getText());
		a.accept();
	}

}
