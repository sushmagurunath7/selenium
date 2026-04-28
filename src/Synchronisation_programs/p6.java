package Synchronisation_programs;
/* program for Fluent wait */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p6 {
	public static void main(String[] args) throws Throwable {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("https://app.elorus.com/login");

		//identifies the username and enters the data
		driver.findElement(By.id("id_email")).sendKeys("Sushma2@gmail.com");

		//identifies the password and enters the data
		driver.findElement(By.id("id_password")).sendKeys("Sushmaselenium1234");

		//identifies the login and clicks 
		driver.findElement(By.cssSelector("input[value='SIGN IN']")).click();

		//creates an object of Fluentwait
		FluentWait wait = new FluentWait(driver);

		//specifies the polling period
		wait.pollingEvery(Duration.ofMillis(250));

		//specifies the Timeout period
		wait.withTimeout(Duration.ofSeconds(30));

		//ignores the exception
		wait.ignoring(NoSuchElementException.class);

		//wait until user menu is visible 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='User menu']")));
		
		//identifies usermenu and clicks
		driver.findElement(By.xpath("//a[@title='User menu']")).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Logout']")));

		//identifies logout and clicks
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}
}
