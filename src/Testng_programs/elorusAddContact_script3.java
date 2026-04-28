package Testng_programs;
/* script for elorus add contact*/

import org.testng.annotations.Test;

import POM_pages.initialisePages;

public class elorusAddContact_script3 extends BaseTest3{
	
	@Test
	public void elorusAddContact_script() {
		//create an object of initialisePages
		initialisePages pages = new initialisePages(driver);
		
		//enters the username
		pages.elorusLogin.setUsername("Sushma3@gmail.com");
		
		pages.elorusLogin.setPassword("Sushmaselenium1234");
		
		pages.elorusLogin.clickSignIn();
		
		pages.elorusHome.clickContacts();
		
		pages.elorusContacts.clickAdd();
		
		pages.elorusAddContact.setFirstName("Sushma");
		
		pages.elorusAddContact.setLastName("G");
		
		pages.elorusAddContact.setCompany("QSP");
		
		pages.elorusAddContact.setProfession("Test Engineer");
		
		pages.elorusAddContact.clickSave();
	}

}
