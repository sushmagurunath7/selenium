package Actions_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/* progarm for scroll */
public class p3 {
	public static void main(String[] args) throws Throwable {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and waits until it is loaded
		driver.get("https://www.actitime.com");

		//identifies the subscribe button
		WebElement subscribe = driver.findElement(By.xpath("//button[@class='right__button']"));

		//craetes an object of Actions class
		Actions a = new Actions(driver);

		//scrolls to the subscribe button
		a.scrollToElement(subscribe).perform();

	}

}
