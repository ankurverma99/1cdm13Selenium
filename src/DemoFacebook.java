import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFacebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		/*
		 * WebElement ele = driver.findElement(By.id("email")); ele.sendKeys("Ankur");
		 * WebElement password = driver.findElement(By.name("pass"));
		 * password.sendKeys("123456A"); // WebElement login =
		 * driver.findElement(By.id("loginbutton")); // login.click();
		 * driver.findElement(By.linkText("Forgotten account?")).click();
		 */
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ankur");
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("anythig", Keys.ENTER);
	}

}
