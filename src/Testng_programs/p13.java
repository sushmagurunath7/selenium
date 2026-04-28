package Testng_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM_pages.initialisePages;

/* program for DataProvider */
public class p13 {

	@Test(dataProviderClass = elorusDataProviders.class,dataProvider = "elorusAddContactData")
	
	public void elorusAddContact_Script(String un,String pw,String fn,String ln,String com,String prof) {
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	//launches the chrome browser
	WebDriver driver = new ChromeDriver();

	//maximizes the browser window 
	driver.manage().window().maximize();
	
	//retrieves the web app and wait until it is loaded
	driver.get("https://app.elorus.com/login");
	
	initialisePages pages = new initialisePages(driver);
			//enters the username
			pages.elorusLogin.setUsername(un);
			
			pages.elorusLogin.setPassword(pw);
			
			pages.elorusLogin.clickSignIn();
			
			pages.elorusHome.clickContacts();
			
			pages.elorusContacts.clickAdd();
			
			pages.elorusAddContact.setFirstName(fn);
			
			pages.elorusAddContact.setLastName(ln);
			
			pages.elorusAddContact.setCompany(com);
			
			pages.elorusAddContact.setProfession(prof);
			
			pages.elorusAddContact.clickSave();
			driver.quit();
	}
}
