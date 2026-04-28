package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elorus3 {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("https://app.elorus.com/login");

		//identifies the user name and enters the data 
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Sushma@gmail.com");

		//identifies the password and enters the data
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sushmaselenium123");

		//identifies the login and clicks
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
	}
}
