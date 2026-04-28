package POM_pages;

import org.openqa.selenium.WebDriver;

/* class to initialize the POM pages */

public class initialisePages {
	
	public elorusLogin_page2 elorusLogin;
	public elorusHome_page2 elorusHome;
	public elorusContacts_page2 elorusContacts;
	public elorusAddContact_page2 elorusAddContact;

	public initialisePages(WebDriver driver) {
		this.elorusLogin = new elorusLogin_page2(driver);
		this.elorusHome = new elorusHome_page2(driver);
		this.elorusContacts = new elorusContacts_page2(driver);
		this.elorusAddContact = new elorusAddContact_page2(driver);
		
		
	}
}
