package Select_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/* program for deselecting the options*/

public class p3 {
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
		driver.get("file:///C:/Users/sushm/OneDrive/Desktop/selenium6.html");
		
		//identifies the list Box
		WebElement listBox = driver.findElement(By.id("KB"));
		
		//creates an object of Select class
		Select s = new Select (listBox);
		
		//selects the option with index = 0;
		s.selectByIndex(0);
		
		//selects the option with value = 'T'
		s.selectByValue("T");
		
		//selects the option with text = 'Lolipop'
		s.selectByVisibleText("Lolipop");
		
		//selects the option with text = 'PepperPaneer'
		s.selectByContainsVisibleText("PepperPaneer");
		
		//pauses for 5 seconds
		Thread.sleep(5000);
		
		//deselects all the options
		s.deselectAll();
		
		//driver.quit();
		
	}

}
