import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoActiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		/*
		 * driver.findElement(By.id("username")).sendKeys("admin");
		 * driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);
		 */
		/*
		 * driver.findElement(By.partialLinkText("Inc.")).click(); Set<String> tabs =
		 * driver.getWindowHandles(); for (String tab : tabs) {
		 * driver.switchTo().window(tab); } System.out.println(driver.getTitle());
		 */
		System.out.println(driver.getTitle());
		WebElement username = driver.findElement(By.xpath("//b[text()='admin']"));
		String usertext = username.getText();
		System.out.println(usertext);
		WebElement password = driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		System.out.println(password.getText());
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usertext);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password.getText());
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		if (driver.getTitle().contains("Enter Time"))
			System.out.println("loged in");
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
	}

}
