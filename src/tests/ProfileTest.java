package tests;

import org.testng.annotations.Test;

import pages.LocationPopUpPage;

public class ProfileTest extends BasicTest {

	public ProfileTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	
	public void ProfileFunctionality() throws InterruptedException {
		this.driver.navigate().to(baseURL + "login-form"); 
	LocationPopUpPage lpp = new LocationPopUpPage(driver, wait, js);
	lpp.closePopUp();
	Thread.sleep(2000);
	lpp.OpenPopUp();
	lpp.setLocation("City Center - Albany");
	Thread.sleep(2000);
	
	}

}
