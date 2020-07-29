package Org.qsp.Pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumHome {
	@FindBy(name = "search")
	private WebElement search;
	@FindBy(xpath = "//img[@class='search-icon']")
	private WebElement searchBtn;

	public SeleniumHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void sendText(String text) {
		search.sendKeys(text, Keys.ENTER);
	}

	public void clickSearchBtn() {
		searchBtn.click();
	}
}
