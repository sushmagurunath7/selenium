package Synchronisation_programs;
/*program for explicit wait */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p5 {
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

		//identifies the username and enters the data
		driver.findElement(By.id("id_email")).sendKeys("Sushma2@gmail.com");

		//identifies the password and enters the data
		driver.findElement(By.id("id_password")).sendKeys("Sushmaselenium1234");

		//identifies the login and clicks 
		driver.findElement(By.cssSelector("input[value='SIGN IN']")).click();

		//wait until the sign in button is invisible
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("input[value='SIGN IN']")));

		//waits until the user menu button is visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='User menu']")));

		//identifies usermenu and clicks
		driver.findElement(By.xpath("//a[@title='User menu']")).click();

		//waits until the log out button is visible
		/*wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']"))); */
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Logout']")));
		
		//identifies logout and clicks
		driver.findElement(By.xpath("//a[text()='Logout']")).click();


	}
}
