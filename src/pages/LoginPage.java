package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasicPage {

	public LoginPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
		super(driver, wait, js);
	}
//	ucitajte stranicu http://demo.yo-meals.com/guest-user/login-form
//		ugasite lokacioni iskacuci dijalog
//		prijavite se na aplikaciju preko demo naloga
	
//		verifikujte da je prikazana poruka sa tekstom "Login Successfull"
//		ucitajte stranicu http://demo.yo-meals.com/member/profile
//		zamenite sve osnovne informacije korisnika



	
	public WebElement getEmail() {
		return this.driver.findElement(By.xpath("//*[@id=\"frm_fat_id_frmLogin\"]/fieldset[1]/input"));
	}
	
	public WebElement getPassword() {
		return this.driver.findElement(By.xpath("//*[@id=\"frm_fat_id_frmLogin\"]/fieldset[2]/input"));
	}
	
	public WebElement getLoginButton() {
		return this.driver.findElement(By.className("btn--primary"));
	}
	public void login(String email, String password) {
		this.getEmail().clear();
		this.getEmail().sendKeys(email);
		this.getPassword().clear();
		this.getPassword().sendKeys(password);
		this.getLoginButton().click();
		
	}
	

	
}
