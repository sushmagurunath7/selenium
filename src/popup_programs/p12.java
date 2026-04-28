package popup_programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* program for authentication pop up */
public class p12 {
	public static void main(String[] args) {
		// sets path for chromedriver.exe
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

				//launches the chrome browser
				WebDriver driver = new ChromeDriver();

				//defines an implicitly wait of 30 seconds
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

				//maximizes the browser window 
				driver.manage().window().maximize();
				
				String username= "admin";
				String password = "admin";
				
				driver.get("https://"+username+ ":" +password+"@the-internet.herokuapp.com/basic_auth");
	}

}
