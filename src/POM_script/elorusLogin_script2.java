package POM_script;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.elorusLogin_page2;

/* script for elorus login */

public class elorusLogin_script2 {
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
		elorusLogin_page2 ob = new elorusLogin_page2(driver);
		
		//enters username
		ob.setUsername("Sushma3@gmail.com");
		
		//enters password
		ob.setPassword("Sushmaselenium1234");
		
		//clicks sign in 
		ob.clickSignIn();
		
	}
}
