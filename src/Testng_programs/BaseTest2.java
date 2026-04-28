package Testng_programs;
/* program for @BeforeClass and @AfterClass*/

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest2 {
	WebDriver driver;

	@BeforeClass
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		this.driver= new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
