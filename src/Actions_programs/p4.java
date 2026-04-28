package Actions_programs;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/* Program for right click */
public class p4 {
	public static void main(String[] args) throws Throwable {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and waits until it is loaded
		driver.get("https://app.elorus.com/login");
		
		//identifies the reset password
		WebElement resetpwd = driver.findElement(By.linkText("Reset password."));
		
		//creates an object of Actions class
		Actions a = new Actions(driver);

		//right clicks on Reset password
		a.contextClick(resetpwd).perform();
		
		//creates an object of robot class
		Robot r = new Robot();
		
		//presses and releases G
		r.keyPress(KeyEvent.VK_G);
		r.keyRelease(KeyEvent.VK_G);
		
	}

}
