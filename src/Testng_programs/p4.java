package Testng_programs;
/* program for @BeforeMethod and @AfterMethod */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class p4 {
	WebDriver driver;

	@BeforeMethod
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		this.driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();
	}
	
	@Test
	public void fbLoginScript() {
		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("sushmag@77gamil.com");


		driver.findElement(By.id("pass")).sendKeys("1234567");

		driver.findElement(By.name("login")).click();

	}

	@Test
	public void elorusLoginScript() {

		driver.get("https://app.elorus.com/login");

		driver.findElement(By.id("id_email")).sendKeys("Sushma@gmail.com");

		driver.findElement(By.id("id_password")).sendKeys("Sushmaselenium123");

		driver.findElement(By.cssSelector("input[value='SIGN IN']")).click();
	}
		
		@AfterMethod
		public void closeBrowser() {
			driver.quit();
		}


	}

