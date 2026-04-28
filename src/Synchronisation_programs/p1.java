package Synchronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();
		
		/* defines an implicitly wait of 30 seconds */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

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
		
		//identifies usermenu and clicks
		driver.findElement(By.xpath("//a[@title='User menu']")).click();
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		

	}
}
