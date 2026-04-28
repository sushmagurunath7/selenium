package webelement_programs;
/* program for isEnable() and isSelected() */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p10 {
	public static void main(String[] args)  {
		// sets path for chromedriver.exe
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and waits until it is loaded
		driver.get("https://www.facebook.com");
		
		//identifies username
		WebElement username = driver.findElement(By.name("email"));
		
		//checks whether username is enabled
		System.out.println(username.isEnabled());
		System.out.println("-------------------");
		
		//identifies and clicks on create a new account
		 driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		 
		//identifies the male radio button
		 WebElement maleRadio =driver.findElement(By.xpath("//label[text()='Male']/input"));
		
		//checks whether male radio button is enabled
		System.out.println(maleRadio.isSelected());
		
		//selects the male radio button
		maleRadio.click();
		
		//checks whether male Radio button is enabled
		System.out.println(maleRadio.isSelected());
		
		driver.quit();
	}
}
