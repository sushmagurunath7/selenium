package webelement_programs;

/* program for isDisplayed() */ 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p9 {
	public static void main(String[] args)  {
		// sets path for chromedriver.exe
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and waits until it is loaded
		driver.get("https://app.elorus.com");
		
		//identifies the welcome page text
		WebElement welcomePageText = driver.findElement(By.xpath("//h1[text()='Welcome to Elorus']"));
		
		//checks whether welcome page is displayed
		System.out.println(welcomePageText.isDisplayed());
		
		//validates whether the login page is loaded
		if (welcomePageText.isDisplayed()) {
			System.out.println("Login page is loaded");
		}
		else 
			System.out.println("Login page is not loaded"); 
		
		//closes the browser
		driver.quit();
	}
	
}
