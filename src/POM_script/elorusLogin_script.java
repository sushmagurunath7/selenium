package POM_script;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.elorusLogin_page;

/* script for elorus login */

public class elorusLogin_script {
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
		elorusLogin_page ob = new elorusLogin_page(driver);
		
		//enters the username
		ob.tbUsername.sendKeys("Sushma3@gmail.com");
		
		//enters the password
		ob.tbPassword.sendKeys("Sushmaselenium1234");

		//clicks on Sign In
		ob.btnSignIN.click();
		
	}
}
