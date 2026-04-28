package webdriver_programs;

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
		
		//closes all the windows
		driver.quit();
		
	}


}
