import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoMultiSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/html/multi.html");
		WebElement ele = driver.findElement(By.id("b"));
		Select s = new Select(ele);
		List<WebElement> opts = s.getOptions();
		if (s.isMultiple()) {
			s.selectByValue(opts.get(1).getText());
			s.selectByValue(opts.get(3).getText());

		}
		/*
		 * for (WebElement opt : opts) { s.selectByValue(opt.getText());
		 * Thread.sleep(2000); }
		 */
		System.out.println("=======================");
		List<WebElement> sopt = s.getAllSelectedOptions();
		for (WebElement seletedOpt : sopt) {
			System.out.println(seletedOpt.getText());
		}
		System.out.println("1st option  : " + s.getFirstSelectedOption().getText());
	}

}
