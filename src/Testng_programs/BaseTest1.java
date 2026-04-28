package Testng_programs;
/* program for @BeforeMethod and @AfterMethod */

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest1 {
	public WebDriver driver;

	@BeforeMethod
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		this.driver= new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
