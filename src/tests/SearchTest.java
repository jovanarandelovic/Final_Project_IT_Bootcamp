package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LocationPopUpPage;
import pages.SearchPage;

public class SearchTest extends BasicTest {

	public SearchTest() {
		super();
	}

	@Test

	public void SearchMealTest() throws IOException, InterruptedException {
		LocationPopUpPage lpp = new LocationPopUpPage(driver, wait, js);
		SearchPage sp = new SearchPage(driver, wait, js);
		this.driver.navigate().to(baseURL + "meals");

		lpp.setLocation("City Center - Albany");
		Thread.sleep(2000);

		File file = new File("data/Data.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Meal Search Results");
		SoftAssert sa = new SoftAssert();

		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Thread.sleep(1500);
			XSSFRow row = sheet.getRow(i);
			String location = row.getCell(0).getStringCellValue();
			String url = row.getCell(1).getStringCellValue();
			int resultNumber = (int) row.getCell(2).getNumericCellValue();
			Thread.sleep(1500);

			lpp.OpenPopUp();

			lpp.setLocation(location);
			Thread.sleep(1500);
			driver.navigate().to(url);
			Thread.sleep(1500);
			sa.assertEquals(sp.getMealItemNumber(), resultNumber, "[ERROR] The number of meals is not as expected!");
			Thread.sleep(1500);

			for (int j = 3; j < 3 + resultNumber; j++) {
				Thread.sleep(1500);

				String meal = row.getCell(j).getStringCellValue();
				Thread.sleep(1500);

				sa.assertTrue(sp.getNames().get(j - 3).contains(meal), "[ERROR] The meal names are not the same!");
			}

		}
		sa.assertAll();

		fis.close();
		wb.close();
	}
}