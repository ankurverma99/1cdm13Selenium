import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladder {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(2000);
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		System.out.println(menus.getClass());
		System.out.println("=============================");
		Actions a = new Actions(driver);
		for (WebElement menuName : menus) {
			String name = menuName.getText();
			System.err.println(name);
			Thread.sleep(2000);
			a.moveToElement(menuName).perform();
			Thread.sleep(2000);
			TakeScreenS.takeScreenS(name, driver);
			Thread.sleep(1000);
			List<WebElement> subMenues = driver.findElements(
					By.xpath("//span[contains(.,'" + name + "')]/parent::li/descendant::ul[@class='taxonslist']/li"));
			for (WebElement subMenueName : subMenues) {
				System.out.println(subMenueName.getText());
			}
		}
	}

}
