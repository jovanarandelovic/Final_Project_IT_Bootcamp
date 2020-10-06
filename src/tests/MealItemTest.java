package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.CartSummaryPage;
import pages.LocationPopUpPage;
import pages.LoginPage;
import pages.MealPage;
import pages.NotificationSystemPage;

public class MealItemTest extends BasicTest {

	public MealItemTest() {
		super();
	}

	@Test(priority = 0)

	public void AddMealToCartTest() throws InterruptedException {
		LocationPopUpPage lpp = new LocationPopUpPage(driver, wait, js);
		NotificationSystemPage nsp = new NotificationSystemPage(driver, wait, js);
		MealPage mp = new MealPage(driver, wait, js);

		this.driver.navigate().to(baseURL + "meal/chicken-sandwich-beef-empanadas-combo");

		lpp.closePopUp();

		mp.addMealToCart(4);

		Assert.assertTrue(nsp.getNotificationMessage()
				.contains("The Following Errors Occurred:" + "\n" + "Please Select Location"));

		nsp.waitForNotDisappearance();

		Thread.sleep(1000);

		lpp.OpenPopUp();
		lpp.setLocation("City Center - Albany");

		Thread.sleep(1000);

		mp.addMealToCart(4);

		Assert.assertTrue(nsp.getNotificationMessage().contains("Meal Added To Cart"), "[ERROR] Cart is empty!");

		Thread.sleep(2000);
	}

	@Test(priority = 5)

	public void AddMealToFavoriteTest() throws InterruptedException {
		LocationPopUpPage lpp = new LocationPopUpPage(driver, wait, js);
		NotificationSystemPage nsp = new NotificationSystemPage(driver, wait, js);
		MealPage mp = new MealPage(driver, wait, js);
		LoginPage lp = new LoginPage(driver, wait, js);

		this.driver.navigate().to(baseURL + "meal/chicken-sandwich-beef-empanadas-combo");
		lpp.closePopUp();

		mp.addToFavorites();

		Assert.assertTrue(nsp.getNotificationMessage().contains("Please login first!"), "[ERROR] Already logged in!");
		this.driver.navigate().to(baseURL + "guest-user/login-form");

		lp.login(email, password);
		this.driver.navigate().to(baseURL + "meal/chicken-sandwich-beef-empanadas-combo");
		mp.addToFavorites();
		Assert.assertTrue(nsp.getNotificationMessage().contains("Product has been added to your favorites."),
				"[ERROR] Product not added to favorites");
	}

	@Test(priority = 10)

	public void ClearCartTest() throws InterruptedException, IOException {
		LocationPopUpPage lpp = new LocationPopUpPage(driver, wait, js);
		NotificationSystemPage nsp = new NotificationSystemPage(driver, wait, js);
		MealPage mp = new MealPage(driver, wait, js);
		CartSummaryPage csp = new CartSummaryPage(driver, wait, js);

		this.driver.navigate().to(baseURL + "meals");

		lpp.setLocation("City Center - Albany");

		File file = new File("data/Data.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Meals");
		SoftAssert sa = new SoftAssert();

		for (int i = 1; i <= sheet.getLastRowNum(); i++) {

			XSSFRow row = sheet.getRow(i);
			String meal = row.getCell(0).getStringCellValue();
			this.driver.navigate().to(meal);
			mp.addMealToCart(2);
			sa.assertTrue(nsp.getNotificationMessage().contains("Meal Added To Cart"), "[ERROR] Cart is empty!");

		}
		sa.assertAll();

		Thread.sleep(2000);

		csp.clearCart();

		Assert.assertTrue(nsp.getNotificationMessage().contains("All meals removed from Cart successfully"),
				"[ERROR] Cart is not cleared!");

		fis.close();

		wb.close();
	}

}
