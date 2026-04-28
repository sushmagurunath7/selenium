package apache_programs;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM_pages.initialisePages;

public class p4 {
	String elorusExcel = "./data/ElorusData.xlsx";

	public static String getData(String excelPath, String sn, int row, int col) throws Throwable {
		FileInputStream f = new FileInputStream(excelPath);
		Workbook book = WorkbookFactory.create(f);
		String d = book.getSheet(sn).getRow(row).getCell(col).getStringCellValue();
		return d;

	}

	//	public static void main(String[] args) throws Throwable {
	//		System.out.println(getData("./data/ElorusData.xlsx","demo",0,0));
	//		System.out.println(getData("./data/ElorusData.xlsx", "demo", 1, 0));
	//	}

	@Test
	public void elorusLogin_script() throws Throwable {


		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		/* defines an implicitly wait of 30 seconds */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get(getData(elorusExcel, "elorus", 1, 0));

		//creates an object of initialisePages
		initialisePages pages = new initialisePages(driver);

		//enters username
		pages.elorusLogin.setUsername(getData(elorusExcel, "elorus", 1, 1));

		//enters password
		pages.elorusLogin.setPassword(getData(elorusExcel, "elorus", 1, 2));

		//clicks on signIn
		pages.elorusLogin.clickSignIn();

	}

	@Test
	public void elorusAddContact_script() throws Throwable {
		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		/* defines an implicitly wait of 30 seconds */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get(getData(elorusExcel, "elorus", 1, 0));

		//creates an object of initialisePages
		initialisePages pages = new initialisePages(driver);

		//enters username
		pages.elorusLogin.setUsername(getData(elorusExcel, "elorus", 1, 1));

		//enters password
		pages.elorusLogin.setPassword(getData(elorusExcel, "elorus", 1, 2));

		//clicks on signIn
		pages.elorusLogin.clickSignIn();

		//clicks on contacts
		pages.elorusHome.clickContacts();

		//clicks add
		pages.elorusContacts.clickAdd();

		//Enters first name 
		pages.elorusAddContact.setFirstName(getData(elorusExcel, "elorus", 1, 3));

		//Enters last name
		pages.elorusAddContact.setLastName(getData(elorusExcel, "elorus", 1, 4));

		//enters company
		pages.elorusAddContact.setCompany(getData(elorusExcel, "elorus", 1, 5));

		//enters profession
		pages.elorusAddContact.setProfession(getData(elorusExcel, "elorus", 1, 6));

		//clicks on save button
		pages.elorusAddContact.clickSave();


	}
}
