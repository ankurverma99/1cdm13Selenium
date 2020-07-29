import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDselect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/html/multi.html");
		WebElement ele = driver.findElement(By.id("b"));
		Select s = new Select(ele);
		List<WebElement> opts = s.getOptions();
		if (s.isMultiple())
			for (WebElement opt : opts) {
				s.selectByValue(opt.getText());
				Thread.sleep(1000);
			}
		for (WebElement opt : opts) {
			s.deselectByVisibleText(opt.getText());
			Thread.sleep(1000);
		}

		// s.deselectAll();
	}

}
