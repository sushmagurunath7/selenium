package POM_script;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.elorusHome_page2;
import POM_pages.elorusLogin_page2;
/* Script for elorus Logout */

public class elorusLogout_script2 {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

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
		
		//creates an object of elorusHome_page2
		elorusHome_page2 ob2 = new elorusHome_page2(driver);
		
		//clicks on user menu
		ob2.clickUserMenu();
		
		//clicks on logout 
		ob2.clickLogout();
		
	}

}
