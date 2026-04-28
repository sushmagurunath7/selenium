package Actions_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/* program for Mouseover operation --Myntra */

public class p2 {
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
		driver.get("https://www.Myntra.com/");

		//iterates the List<WebElement> mainmenu and mouseover on every element pausing for 2 secs
		List<WebElement> mainMenu = driver.findElements(By.xpath("//div[@class='desktop-navContent']"));

		//craetes an object of Actions class
		Actions a = new Actions(driver);
		
		for (WebElement lv : mainMenu) {
			a.moveToElement(lv).perform();
			Thread.sleep(2000);

		}
	}
}
