package webdriver_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// program for get() and close()

public class p1 {
	public static void main(String[] args) {
		//sets path for chromedriver.exe 
		/* this step is not necessary as selenium downloads updated version of suitable exe based on the object created */
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//launches the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//retrieves the web application and waits until it is loaded
		driver.get("https://www.Facebook.com");
		
		//closes the browser window
		driver.close();
	}
}
