package popup_programs;
/* ASSIGNMENT*/
//program for authentification pop-up (AutoIt)

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p14 {
	public static void main(String[] args) throws Throwable {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//defines an implicitly wait of 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//maximizes the browser window 
		driver.manage().window().maximize();

		//fetches the web app and waits until it is loaded
		driver.get("https://the-internet.herokuapp.com/basic_auth");
	
		Runtime.getRuntime().exec("./upload/fileupload2.exe");
		
	}

}
