package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotificationSystemPage extends BasicPage {

	public NotificationSystemPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
		super(driver, wait, js);
	}
	
	
	public WebElement getNotification() {
		return this.driver.findElement(By.xpath("//*[contains(@class, 'alert--success') or contains(@class, 'alert--danger')][contains(@style,'display: block')]\r\n" + 
				""));
	}
	
	public String getNotificationText() {
		return this.getNotification().getText();
		
	}
//This method does not work	
	public void waitForNotDisappearance() {
		WebElement message = this.driver.findElement(By.xpath("//*[contains(@class, 'system_message')]"));
//	WebElement message = this.driver.findElement(By.xpath("//*[contains(@class, \"system_message\")]"));

	//	wait.until(ExpectedConditions.attributeContains(message, "style", "display: none;"));
		
		wait.until(ExpectedConditions.attributeContains(By.xpath("//*[contains(@class, 'system_message')]"), "style", "display: none;"));
//					<div class="system_message alert alert--success" hidden="hidden" style="display: none;">
//		<a class="closeMsg" href="javascript:void(0)"></a>
//		<div class="content">
//			<div class="div_msg"><ul><li>Logout Successfull!</li></ul></div>	</div>
//	</div>
	}
}
