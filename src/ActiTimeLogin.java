import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement userName = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		String unValue = readCell("Sheet1", 1, 0);
		userName.sendKeys(unValue);
		String pwValue = readCell("Sheet1", 1, 1);
		password.sendKeys(pwValue, Keys.ENTER);

	}

	public static String readCell(String sheetName, int r, int c) throws Exception {
		FileInputStream fis = new FileInputStream(".\\data.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		Sheet sh = w.getSheet(sheetName);
		String value = sh.getRow(r).getCell(c).toString();
		return value;

	}

}
