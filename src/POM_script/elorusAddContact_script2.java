package POM_script;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.elorusAddContact_page2;
import POM_pages.elorusContacts_page2;
import POM_pages.elorusHome_page2;
import POM_pages.elorusLogin_page2;

/* program for  elorus Add contact*/
public class elorusAddContact_script2 {
	public static void main(String[] args) {
		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		/* defines an implicitly wait of 30 seconds */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("https://app.elorus.com/login");

		//creates an object of elorusLogin_page--cz to access the non-static variables
		elorusLogin_page2 ob1 = new elorusLogin_page2(driver);

		//enters the username
		ob1.setUsername("Sushma3@gmail.com");
		//enters the password
	ob1.setPassword("Sushmaselenium1234");

		//clicks on Sign In
		ob1.clickSignIn();

		elorusHome_page2 ob2 = new elorusHome_page2(driver);
		ob2.clickContacts();

		//creates an object of elorus contact page
		elorusContacts_page2 ob3 = new elorusContacts_page2(driver);
		
		ob3.clickAdd();

		//creates an object of elorus elorusAddContact_page
		elorusAddContact_page2 ob4 = new elorusAddContact_page2(driver);

		//enters the first name
		ob4.setFirstName("Sushma");

		//enters the last name
		ob4.setLastName("G");

		//enters the company
		ob4.setCompany("Software");

		//enters the profession
		ob4.setProfession("SSE");

		//clicks on save
		ob4.clickSave();
	}

}
