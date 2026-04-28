package Actions_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/* program for double click*/

public class p6 {
	public static void main(String[] args) throws Throwable  {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//defines an implicitly wait of 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and waits until it is loaded
		driver.get("file:///C:/Users/sushm/OneDrive/Desktop/doubleClick.html");
		
		//
		WebElement copy = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		Actions a = new Actions(driver);
		
		//double click on action class
		a.doubleClick(copy).perform();
		
	}
		
}
