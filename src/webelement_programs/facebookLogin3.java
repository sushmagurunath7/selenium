package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLogin3 {
	public static void main(String[] args) {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("https://www.facebook.com/");

		//identifies the user name and enters the data 
		driver.findElement(By.xpath("//input[@data-testid='royal-email']")).sendKeys("Thamanna@gmail.com");

		//identifies the password and enters the data 
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1234567");

		//identifies the login and clicks 
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
