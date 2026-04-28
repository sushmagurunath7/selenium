package Testng_programs;
/* program for parallel execution or cross browser execution */

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest3 {
	WebDriver driver; 
	@Parameters("BrowserName")
	@BeforeMethod
	public void launchBrowser(String BN) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");//it works without this setproperty but with only object it works

		if (BN.equalsIgnoreCase("Chrome")) 
			this.driver= new ChromeDriver();
		else if (BN.equalsIgnoreCase("Firefox")) 
			this.driver = new FirefoxDriver();
		else if (BN.equalsIgnoreCase("Edge")) 
			this.driver= new EdgeDriver();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://app.elorus.com/login");

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();

	}

}
