package popup_programs;
/* program for child Browser pop up */

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p9 {
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

		//handles  multiple windows
		multipleWindow(driver);
		
		//identifies and clicks on login button
		driver.findElement(By.linkText("Login")).click();
	}

	public static void multipleWindow(WebDriver driver) {

		//retrieves the handles of main window
		String mainWindow = driver.getWindowHandle();

		//retrieves the handles of all the windows
		Set<String> allWindows = driver.getWindowHandles();

		//Iterates the Set<String> allWindows using For Each loop
		for (String lv : allWindows) {
			
			//switches the control to specified window 	
			driver.switchTo().window(lv);

			//closes all the child windows
			if (!lv.contains(mainWindow)) {
				driver.close();

			}
		}
		//switches the control to the main window
		driver.switchTo().window(mainWindow);

	}
}
