package Actions_programs;
/* program for Mouseover operation */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p1 {
	public static void main(String[] args) throws Throwable {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//defines an implicitly wait of 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("https://www.vtiger.com/");
		
		//identifies the resources 
		WebElement resources = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		 
		//creates an object of Actions class
		Actions a = new Actions(driver);
		
		//performs mouseover operation
		a.moveToElement(resources).perform();
		
	}

}
