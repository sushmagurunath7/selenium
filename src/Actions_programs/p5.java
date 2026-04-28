package Actions_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/* program for drag and drop */
public class p5 {
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
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		//identifies the frame 
		WebElement frameElement = driver.findElement(By.className("demo-frame"));
		
		//switches the control to the frame
		driver.switchTo().frame(frameElement);
		
		//identifies all the images 
		List<WebElement> images = driver.findElements(By.xpath("//ul[@id='gallery']/child::li"));
		
		//identifies the trash
		WebElement trash = driver.findElement(By.id("trash"));
		

		//creates an object of Actions class
		Actions a = new Actions(driver);
		
		//moves all the images to the trash
		for (WebElement lv : images) {
			a.dragAndDrop(lv, trash).perform();
			Thread.sleep(2000);
			
		}
	}
		

}
