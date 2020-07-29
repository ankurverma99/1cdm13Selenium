import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement slider = driver.findElement(By.id("slider"));
		Actions a = new Actions(driver);
		for (int i = 0; i < 10; i++) {
			a.dragAndDropBy(slider, 100, 0).perform();
			Thread.sleep(1000);
			a.dragAndDropBy(slider, -100, 0).perform();
		}
	}

}
