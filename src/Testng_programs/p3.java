package Testng_programs;
/* program for @Test */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class p3 {
	@Test
	public void fbLoginScript() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com");
		
		
		driver.findElement(By.id("email")).sendKeys("sushmag@77gamil.com");
		
		
		driver.findElement(By.id("pass")).sendKeys("1234567");
	
		driver.findElement(By.name("login")).click();
	
		driver.quit();
	}
	
	@Test
	public void elorusLoginScript() {
	
			WebDriver driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get("https://app.elorus.com/login");
			
			driver.findElement(By.id("id_email")).sendKeys("Sushma@gmail.com");
			
			driver.findElement(By.id("id_password")).sendKeys("Sushmaselenium123");
			
			driver.findElement(By.cssSelector("input[value='SIGN IN']")).click();
			
			driver.quit();
			
		}

}
