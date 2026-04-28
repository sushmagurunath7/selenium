package POM_script;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.initialisePages;

/* program for  elorus Add contact*/
public class elorusAddContact_script3 {
	public static void main(String[] args) {
		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		/* defines an implicitly wait of 30 seconds */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("https://app.elorus.com/login");

		//creates an object of initialisePages
		initialisePages pages = new initialisePages(driver);
		
		//enters username
		pages.elorusLogin.setUsername("Sushma3@gmail.com");
		
		//enters password
		pages.elorusLogin.setPassword("Sushmaselenium1234");
		
		//clicks on signIn
		pages.elorusLogin.clickSignIn();
		
		//clicks on contacts
		pages.elorusHome.clickContacts();
		
		//clicks add
		pages.elorusContacts.clickAdd();
		
		//Enters first name 
		pages.elorusAddContact.setFirstName("Sushma");
		
		//Enters last name
		pages.elorusAddContact.setLastName("G");
		
		//enters company
		pages.elorusAddContact.setCompany("Software");
		
		//enters profession
		pages.elorusAddContact.setProfession("SSE");
		
		//clicks on save button
		pages.elorusAddContact.clickSave();
	}

}
