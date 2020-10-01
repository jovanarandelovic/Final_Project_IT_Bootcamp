package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends BasicPage {

	public ProfilePage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
		super(driver, wait, js);

	}

	public WebElement getFirstName() {
		return this.driver.findElement(By.xpath("//*[@id=\"profileInfoFrm\"]/div[1]/div[1]/fieldset/input"));
	}

	public WebElement getLastName() {
		return this.driver.findElement(By.xpath("//*[@id=\"profileInfoFrm\"]/div[1]/div[2]/fieldset/input"));
	}

	public WebElement getAddress() {
		return this.driver.findElement(By.xpath("//*[@id=\"profileInfoFrm\"]/div[2]/div[2]/fieldset/input"));
	}

	public WebElement getPhone() {
		return this.driver.findElement(By.xpath("//*[@id=\"profileInfoFrm\"]/div[3]/div[1]/fieldset/input"));
	}

	public WebElement getZipCode() {
		return this.driver.findElement(By.xpath("//*[@id=\"profileInfoFrm\"]/div[3]/div[2]/fieldset/input"));
	}

	public WebElement getSaveButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"profileInfoFrm\"]/div[5]/div/fieldset/input"));
	}

	public WebElement getCountry() {
		return this.driver.findElement(By.xpath("//*[@id=\"user_country_id\"]"));

	}

	public WebElement getState() {
		return this.driver.findElement(By.xpath("//*[@id=\"user_state_id\"]"));

	}

	public WebElement getCity() {
		return this.driver.findElement(By.xpath("//*[@id=\"user_city\"]"));

	}

	public void setCountry(String country) {
		Select select = new Select(this.getCountry());
		select.selectByVisibleText(country);
	}

	public void setState(String state) {
		Select select = new Select(this.getState());
		select.selectByVisibleText(state);
	}

	public void setCity(String city) {
		Select select = new Select(this.getCity());
		select.selectByVisibleText(city);
	}

	public void changeProfileInfo(String firstName, String lastName, String address, String phone, String zipCode,
			String country, String state, String city) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		this.getFirstName().clear();
		this.getFirstName().sendKeys(firstName);
		this.getLastName().clear();
		this.getLastName().sendKeys(lastName);
		this.getAddress().clear();
		this.getAddress().sendKeys(address);
		this.getPhone().clear();
		this.getPhone().sendKeys(phone);
		this.getZipCode().clear();
		this.getZipCode().sendKeys(zipCode);
		this.setCountry(country);
		this.setState(state);
		this.setCity(city);
		js.executeScript("arguments[0].click();", getSaveButton());

	}

	public WebElement getClickUpload() {
		return this.driver.findElement(By.xpath("//*[@id=\"profileInfo\"]/div/div[1]/div/a[1]"));
	}

	public WebElement getImageInput() {
		return this.driver.findElement(By.xpath("//*[@id=\"form-upload\"]/input"));
	}

	public WebElement getRemovePhotoButton() {

		return this.driver.findElement(By.xpath("//*[@id=\"profileInfo\"]/div/div[1]/div/a[2]"));
	}

	public void changeProfilePhoto(String imagePath) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", getClickUpload());

		this.getImageInput().sendKeys(imagePath);
	}

	public void removePhoto() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", this.getRemovePhotoButton());
	}
}
