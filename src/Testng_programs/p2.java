package Testng_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/* program for @Test */
public class p2 {
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

}
