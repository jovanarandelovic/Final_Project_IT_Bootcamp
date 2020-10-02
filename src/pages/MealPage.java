package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MealPage extends BasicPage {

	public MealPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
		super(driver, wait, js);
	}

	public WebElement getAddToCartButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"body\"]/section[1]/div/div/div[2]/div/div[3]/div[2]/a"));
	}

	public WebElement getFavoriteButton() {
		return this.driver.findElement(By.xpath("//*[@class='product-detail-image']/a"));
	}

	public WebElement getQuantity() {
		return this.driver
				.findElement(By.xpath("//*[@id=\"body\"]/section[1]/div/div/div[2]/div/div[3]/div[1]/ul/li[3]/input"));
	}

	public WebElement getClearAllButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"cartSummary\"]/div/div[1]/a[2]"));
	}

	public void addToFavorites() {
		this.getFavoriteButton().click();
	}

	public void addMealToCart(int amount) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		this.getQuantity().sendKeys(Keys.CONTROL, "a");
		this.getQuantity().sendKeys(String.valueOf(amount));
		js.executeScript("arguments[0].click();", getAddToCartButton());

	}

	public void clearCart() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", this.getClearAllButton());

	}
}
