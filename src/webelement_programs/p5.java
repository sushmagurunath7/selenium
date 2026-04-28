package webelement_programs;
/* program for getSize() */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p5 {
	public static void main(String[] args) throws Throwable {
		// sets path for chromedriver.exe
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and waits until it is loaded
		driver.get("https://app.elorus.com");

		//identifies the username
		WebElement username = driver.findElement(By.name("email"));

		//identifies the password
		WebElement password = driver.findElement(By.name("password"));

		//retrieves the height and width of username
		int h1= username.getSize().getHeight();
		int w1 = username.getSize().getWidth();

		//retrieves the height and width of password 
		int h2 = password.getSize().getHeight();
		int w2= password.getSize().getWidth();

		//validates whether un & pw are of same dimension
		if (h1==h2 && w1==w2) {
			System.out.println("un & pw are of same dimention");

		}
		else {
			System.out.println("un & pw are of not same dimention");
		}
		
		driver.quit();
	}

}
