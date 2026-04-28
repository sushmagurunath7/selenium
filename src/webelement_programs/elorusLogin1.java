package webelement_programs;

//program for elorus login

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elorusLogin1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();
		
		//retrieves the web app and wait until it is loaded
		driver.get("https://app.elorus.com/login");
		
		//identifies the username and enters the data
		driver.findElement(By.id("id_email")).sendKeys("Sushma@gmail.com");
		
		//identifies the password and enters the data
		driver.findElement(By.id("id_password")).sendKeys("Sushmaselenium123");
		
		//identifies the login and clicks 
		driver.findElement(By.cssSelector("input[value='SIGN IN']")).click();
		
	}
}
