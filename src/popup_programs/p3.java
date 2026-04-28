package popup_programs;
/* program for Java Script pop-up (Prompt)*/

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p3 {
	public static void main(String[] args) {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//defines an implicitly wait of 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("file:///C:/Users/sushm/OneDrive/Desktop/prompt.html");

		//identifies and clicks on Try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		//creates an object of WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		//wait until JS pop up is loaded
		wait.until(ExpectedConditions.alertIsPresent());

		//Switches the control to the JS pop up
		Alert a = driver.switchTo().alert();
		
		//enters the data into the text box of pop-up
		a.sendKeys("Sushma");

		//accepts the JS pop up 
		 a.accept(); 
		
	}

}
