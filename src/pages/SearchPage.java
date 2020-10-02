package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BasicPage {

	public SearchPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
		super(driver, wait, js);
	}

	public List<WebElement> getAllSearchResults() {
		return this.driver.findElements(By.xpath("//*[@class='product-name']/a"));
	}

	public ArrayList<String> getNames() {
		ArrayList<String> mealNames = new ArrayList<String>();
		for (int i = 0; i < this.getAllSearchResults().size(); i++) {
			mealNames.add(getAllSearchResults().get(i).getText());
		}
		return mealNames;

	}

	public int getMealItemNumber() {
		return getAllSearchResults().size();
	}
}
