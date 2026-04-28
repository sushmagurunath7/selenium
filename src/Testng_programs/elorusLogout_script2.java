package Testng_programs;

import org.testng.annotations.Test;

import POM_pages.elorusHome_page2;
import POM_pages.elorusLogin_page2;

public class elorusLogout_script2 extends BaseTest3{
	@Test
	public void elorusLogout_script() {
		//creates an object of elorus login page2
		elorusLogin_page2 ob1 = new elorusLogin_page2(driver);
		
		//enters the username
		ob1.setUsername("Sushma3@gmail.com");
		
		//enters the password
		ob1.setPassword("Sushmaselenium1234");
		
		//clicks on sign in 
		ob1.clickSignIn();
		
		//creates an object of elorusHome_page2
		elorusHome_page2 ob2 = new elorusHome_page2(driver);
		
		//clicks on usermenu 
		ob2.clickUserMenu();
		
		//clicks on logout
		ob2.clickLogout();
	}
	

}
