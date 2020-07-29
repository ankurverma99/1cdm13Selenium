import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivPopUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// constructor overloading
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);
		driver.findElement(By.xpath("//div[@class=\"popup_menu_button popup_menu_button_support\"]")).click();
		driver.findElement(By.xpath("//a[contains(.,'About your actiTIME')]")).click();
		System.out.println(driver.findElement(By.xpath("//td[@class=\"aboutCopyright\"]")).getText());
		driver.findElement(By.id("aboutPopupCloseButtonId")).click();
	}

}
