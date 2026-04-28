package POM_script;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.elorusHome_page;
import POM_pages.elorusLogin_page;
/* Script for elorus Logout */

public class elorusLogout_script {
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
		elorusLogin_page ob1 = new elorusLogin_page(driver);
		
		//enters the username
		ob1.tbUsername.sendKeys("Sushma3@gmail.com");
		
		//enters the password
		ob1.tbPassword.sendKeys("Sushmaselenium1234");

		//clicks on Sign In
		ob1.btnSignIN.click();
		
		//creates an object of elorusHome_page
		elorusHome_page ob2 = new elorusHome_page(driver);
		
		//clicks on user menu
		ob2.btnUserMenu.click();
		
		//clicks on logout
		ob2.btnLogout.click();
		
	}

}
