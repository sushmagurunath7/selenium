package webelement_programs;
/*  program for findElement() */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p11 {
	public static void main(String[] args)  {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and waits until it is loaded
		driver.get("https://www.facebook.com");
		
		//identifies the form 
		WebElement form = driver.findElement(By.xpath("//form[@class='_9vtf']"));
		
		//identifies username and enters the data
		form.findElement(By.id("email")).sendKeys("Thamanna");
		
		//identifies the 
		form.findElement(By.id("pass")).sendKeys("12345");
		
		//
		form.findElement(By.name("login")).click();
	}
}
