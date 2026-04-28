package apache_programs;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.initialisePages;

/* program to read the data from properties file*/
public class p5 {
	public static void main(String[] args) throws Throwable {
		FileInputStream f = new FileInputStream("./data/ElorusData.properties");
		Properties p = new Properties();
		p.load(f);
		
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
		
		System.out.println("---------------------");
		
		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		/* defines an implicitly wait of 30 seconds */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get(p.getProperty("url"));

		//creates an object of initialisePages
		initialisePages pages = new initialisePages(driver);

		//enters username
		pages.elorusLogin.setUsername(p.getProperty("username"));

		//enters password
		pages.elorusLogin.setPassword(p.getProperty("password"));

		//clicks on signIn
		pages.elorusLogin.clickSignIn();
		
	}

}
