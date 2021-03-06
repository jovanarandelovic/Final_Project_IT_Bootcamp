package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartSummaryPage extends BasicPage {

	public CartSummaryPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
		super(driver, wait, js);
	}

	public WebElement getClearAllButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"cartSummary\"]/div/div[1]/a[2]"));
	}

	public void clearCart() {
		this.js.executeScript("arguments[0].click();", this.getClearAllButton());

	}
}
