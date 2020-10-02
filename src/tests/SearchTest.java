package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

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

	public void SearchTest() throws IOException, InterruptedException {
		LocationPopUpPage lpp = new LocationPopUpPage(driver, wait, js);
		SearchPage sp = new SearchPage(driver, wait, js);
		this.driver.navigate().to(baseURL + "meals");

		lpp.setLocation("City Center - Albany");
		Thread.sleep(2000);

		File file = new File("data/Data (1).xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Meal Search Results");
		SoftAssert sa = new SoftAssert();

		for (int i = 1; i <= 6; i++) {

			XSSFRow row = sheet.getRow(i);
			String location = row.getCell(0).getStringCellValue();
			String url = row.getCell(1).getStringCellValue();
			int resultNumber = (int) row.getCell(2).getNumericCellValue();
			ArrayList<String> meals = new ArrayList<String>();
			lpp.OpenPopUp();
			lpp.setLocation(location);
			Thread.sleep(2000);
			driver.navigate().to(url);
			Thread.sleep(2000);

			for (int j = 3; j < 3 + resultNumber; j++) {
				meals.add(row.getCell(i).getStringCellValue());
				Thread.sleep(2000);
				sa.assertEquals(sp.getMealItemNumber(), resultNumber);


			}

			sa.assertEquals(sp.getNames(), meals);
	//		sa.assertEquals(sp.getNames(), meals);


		}
		sa.assertAll();

		fis.close();
		wb.close();
	}
}