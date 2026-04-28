package Testng_programs;

import org.testng.annotations.Test;

import POM_pages.elorusLogin_page2;
/* script for elorus Login*/
public class elorusLogin_script2 extends BaseTest3 {
	@Test
	public void elorusLogin_script() {
		
		//creates an object of elorus login page
		elorusLogin_page2 ob2 = new elorusLogin_page2(driver);
		
		//enters the username
		ob2.setUsername("Sushma3@gmail.com");
		
		//enters the password
		ob2.setPassword("Sushmaselenium1234");
		
		//clicks on sign in 
		ob2.clickSignIn();
	}

}
