package javaScriptExecutor;
/* program for disabled text box */

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {
	public static void main(String[] args) throws Throwable {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and waits until it is loaded
		driver.get("file:///C:/Users/sushm/OneDrive/Desktop/selenium8.html");

		//converts the object from WebDriver type to JavaScriptExecutor type
		JavascriptExecutor jdriver = (JavascriptExecutor) driver;

		//enters the data into disabled textbox
		jdriver.executeScript("document.getElementById('i1').value='selenium'");
		
		

	}

}
