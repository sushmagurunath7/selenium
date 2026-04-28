package POM_script;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.elorusAddContact_page;
import POM_pages.elorusContacts_page;
import POM_pages.elorusHome_page;
import POM_pages.elorusLogin_page;

/* program for  elorus Add contact*/
public class elorusAddContact_script {
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
		elorusLogin_page ob1 = new elorusLogin_page(driver);

		//enters the username
		ob1.tbUsername.sendKeys("Sushma3@gmail.com");

		//enters the password
		ob1.tbPassword.sendKeys("Sushmaselenium1234");

		//clicks on Sign In
		ob1.btnSignIN.click();

		elorusHome_page ob2 = new elorusHome_page(driver);
		ob2.lnkContacts.click();

		//creates an object of elorus contact page
		elorusContacts_page ob3 = new elorusContacts_page(driver);
		ob3.btnAdd.click();

		//creates an object of elorus elorusAddContact_page
		elorusAddContact_page ob4 = new elorusAddContact_page(driver);

		//enters the first name
		ob4.tbFirstName.sendKeys("Sushma");

		//enters the last name
		ob4.tbLastName.sendKeys("G");

		//enters the company
		ob4.tbcompany.sendKeys("software");

		//enters the profession
		ob4.tbprofession.sendKeys("SSE");

		//clicks on save
		ob4.btnSave.click();
	}

}
