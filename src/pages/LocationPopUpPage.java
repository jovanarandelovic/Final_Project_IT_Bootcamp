package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocationPopUpPage extends BasicPage {

	public LocationPopUpPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
		super(driver, wait, js);
	}

	public WebElement getLocationHeader() {
		return this.driver.findElement(By.className("location-selector"));
	}

	public WebElement getCloseButton() {
		return this.driver.findElement(By.className("close-btn-white"));
	}

	public WebElement getKeyword() {
		return this.driver.findElement(By.xpath("//*[@id=\"locality_keyword\"]"));
	}

	public WebElement getLocationItem(String locationName) {
		return this.driver.findElement(By.xpath("//li/a[contains(text(), '" + locationName + "')]/.."));
	}

	public WebElement getLocationInput() {
		return this.driver.findElement(By.xpath("//*[@id=\"location_id\"]"));
	}

	public WebElement getSubmit() {
		return this.driver.findElement(By.xpath("//*[@name=\"btn_submit\"]"));
	}

	public void OpenPopUp() {
		this.getLocationHeader().click();
	}

	public void setLocation(String LocationName) {
		this.getKeyword().click();
		this.js.executeScript("arguments[0].value=arguments[1];", getLocationInput(),
				this.getLocationItem(LocationName).getAttribute("data-value"));
		this.js.executeScript("arguments[0].click();", getSubmit());

	}

	public void closePopUp() {
		this.getCloseButton().click();
	}

}
