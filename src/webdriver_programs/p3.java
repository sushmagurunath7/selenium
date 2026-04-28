package webdriver_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//program for manage()

public class p3 {
	public static void main(String[] args) {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//retrieves the web app and waits until it is loaded
		driver.get("https://www.Facebook.com");

		//delete all cookies 
		 driver.manage().deleteAllCookies(); 

		//maximizes the browser window
		// driver.manage().window().maximize();

		//FullScreens the browser window 
		 driver.manage().window().fullscreen();

		//minimizes the browser window 
		//driver.manage().window().minimize();
	}
}
