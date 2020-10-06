package tests;

import java.io.File;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AuthPage;
import pages.LocationPopUpPage;
import pages.LoginPage;
import pages.NotificationSystemPage;
import pages.ProfilePage;

public class ProfileTest extends BasicTest {

	public ProfileTest() {
		super();
	}

	@Test(priority = 0)

	public void EditProfileTest() throws InterruptedException, IOException {

		LocationPopUpPage lpp = new LocationPopUpPage(driver, wait, js);
		ProfilePage pp = new ProfilePage(driver, wait, js);
		AuthPage ap = new AuthPage(driver, wait, js);
		NotificationSystemPage nsp = new NotificationSystemPage(driver, wait, js);
		LoginPage lp = new LoginPage(driver, wait, js);

		this.driver.navigate().to(baseURL + "guest-user/login-form");

		lpp.closePopUp();

		Thread.sleep(2000);

		lp.login(email, password);

		Assert.assertTrue(nsp.getNotificationMessage().contains("Login Successfull"), "[ERROR] Login failed!");

		nsp.waitForNotDisappearance();

		this.driver.navigate().to(baseURL + "member/profile");

		Thread.sleep(2000);

		pp.changeProfileInfo("Roger", "Marsh", "1577  Hide A Way Road", "408-256-2063", "48876", "United States",
				"Michigan", "Pontiac");

		Assert.assertTrue(nsp.getNotificationMessage().contains("Setup Successful"), "[ERROR] Profile update failed!");

		Thread.sleep(2000);

		ap.logout();

		Assert.assertTrue(nsp.getNotificationMessage().contains("Logout Successfull!"),
				"[ERROR] Profile update failed!");

		nsp.waitForNotDisappearance();

	}

	@Test(priority = 5)

	public void ChangeProfileImageTest() throws InterruptedException, IOException {
		LocationPopUpPage lpp = new LocationPopUpPage(driver, wait, js);
		ProfilePage pp = new ProfilePage(driver, wait, js);
		AuthPage ap = new AuthPage(driver, wait, js);
		NotificationSystemPage nsp = new NotificationSystemPage(driver, wait, js);
		LoginPage lp = new LoginPage(driver, wait, js);

		this.driver.navigate().to(baseURL + "guest-user/login-form");

		lpp.closePopUp();
		Thread.sleep(2000);

		lp.login(email, password);

		Assert.assertTrue(nsp.getNotificationMessage().contains("Login Successfull"), "[ERROR] Login failed!");
		nsp.waitForNotDisappearance();

		this.driver.navigate().to(baseURL + "member/profile");

		Thread.sleep(2000);

		String imgPath = new File("images/profile_photo.jpg").getCanonicalPath();
		pp.changeProfilePhoto(imgPath);

		Thread.sleep(2000);

		Assert.assertTrue(nsp.getNotificationMessage().contains("Profile Image Uploaded Successfully"),
				"[ERROR] Profile photo not uploaded!");

		nsp.waitForNotDisappearance();

		Thread.sleep(2000);

		pp.removePhoto();

		Assert.assertTrue(nsp.getNotificationMessage().contains("Profile Image Deleted Successfully"),
				"[ERROR] Profile photo not deleted!");

		nsp.waitForNotDisappearance();

		ap.logout();

		Assert.assertTrue(nsp.getNotificationMessage().contains("Logout Successfull!"),
				"[ERROR] Profile update failed!");

		nsp.waitForNotDisappearance();

	}

}
