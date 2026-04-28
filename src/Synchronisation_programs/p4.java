package Synchronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p4 {
	public static void main(String[] args) throws Throwable {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//creates an object of WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		//maximizes the browser window 
		driver.manage().window().maximize();
		
		//retrieves the web app and wait until it is loaded
		driver.get("https://app.elorus.com/login");
		
		//wait until the url is https://app.elorus.com/login/
		wait.until(ExpectedConditions.urlToBe("https://app.elorus.com/login/"));
		
		//identifies the username and enters the data
		driver.findElement(By.id("id_email")).sendKeys("Sushma2@gmail.com");

		//identifies the password and enters the data
		driver.findElement(By.id("id_password")).sendKeys("Sushmaselenium1234");

		//identifies the login and clicks 
		driver.findElement(By.cssSelector("input[value='SIGN IN']")).click();
		
		//waits until the url contains 
		wait.until(ExpectedConditions.urlContains("https://software-4.elorus.com/"));
		
		//closes the browser
		driver.quit();
		
	}

}
