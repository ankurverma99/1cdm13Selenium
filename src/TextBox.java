import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait ww = new WebDriverWait(driver, 15);
		driver.get("file:///D:/images/WebDriverWait%20Examples/sam1.html");
		WebElement ele = driver.findElement(By.xpath("//input[@name='textA']"));
		ele.sendKeys("What is your name");
		ww.until(ExpectedConditions.textToBePresentInElementValue(ele, "What is your name"));
		driver.findElement(By.xpath("//input[@name='textB']")).sendKeys("Ankur");
		// WebElement ele1 =
		// driver.findElement(By.xpath("//input[@name='textC']"));
		// driver.findElement(By.xpath("//input[@name='textD']")).sendKeys("Ankur");
		// ele.sendKeys("Aman");
		// ele.sendKeys("Employee");
		// ww.until(ExpectedConditions.textToBe(By.xpath("//input[@name='textC']"),
		// "Employee"));
		// driver.findElement(By.xpath("//input[@name='textD']")).sendKeys("Ankur");

	}

}
