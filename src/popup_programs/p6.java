package popup_programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*Program for notifications and geoLocation pop-up */
public class p6 {
	public static void main(String[] args) {
		
		//creates an Object of ChromeOtions class 
		ChromeOptions options = new ChromeOptions();
		
		//disables notifications
		options.addArguments("--disable-notifications");
		
		//disables geolocation
		options.addArguments("--disable-geolocation");
	
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver(options);

		//defines an implicitly wait of 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("https://www.hdfcbank.com/");
		

	}
}
