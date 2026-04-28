package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elorusLogin2 {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();
		
		//retrieves the web app and wait until it is loaded
		driver.get("https://app.elorus.com/login");
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Sushma@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Sushmaselenium123");
		driver.findElement(By.cssSelector("input[value='SIGN IN']")).click();
		
		System.out.println("----------------------");
		
		//expected url and title of the home page
	
		String expectedHomePageUrl = "https://software-3.elorus.com/";
		String expectedHomePageTitle = "Elorus";
		
		//Actual url and title of the home page
		String actualHomePageUrl = driver.getCurrentUrl();
		String actualHomePageTitle = driver.getTitle();
		
		//validates the login
		if (expectedHomePageUrl.contentEquals(actualHomePageUrl)
				&& (expectedHomePageTitle.contentEquals(actualHomePageTitle)))
		{ 
			System.out.println("Login successfull");
		}
		else {
			System.out.println("Failed to login");
		}
	}
}
