package Synchronisation_programs;

/*program for Implicitly wait*/

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {
	public static void main(String[] args) throws Throwable {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();
		
		/* defines an implicitly wait of 30 seconds */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and waits until it is loaded
		driver.get("https://www.Google.co.in");
		
		//identifies the search box and enters the data
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		
		//identifies all the auto suggestions
		List<WebElement> autosuggestions = driver.findElements(By.xpath("//span[contains(text(), 'selenium')]"));
		
		//iterates the List<WebElement> autosuggestions
		for (WebElement lv : autosuggestions) {
			String text = lv.getText();
			System.out.println(text);
		}
		
		driver.quit();

	}
}
