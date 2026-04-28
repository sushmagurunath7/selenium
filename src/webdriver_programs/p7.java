package webdriver_programs;
//program to close a particular window

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p7 {
	public static void main(String[] args) throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");

		//identifies and clicks on follow all button
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('followall').click()");

		//retrieves the handles of all the windows
		Set<String> allWindows = driver.getWindowHandles();

		//Iterates the Set<String> allWindows using For Each loop
		for (String lv : allWindows) {
			
			//switches the control to specified window 	
			driver.switchTo().window(lv);
			
			//retrieves the title
			String title = driver.getTitle();
		
			
			//closes only Facebook window
			if (title.contains("Facebook")) {
				//closes the window
				driver.close();
				
			}
			
		}

	}
}
