package javaScriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
/* program for Facebook login through Java Script*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {
	public static void main(String[] args) {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("https://www.facebook.com");

		//converts the object from WEbDriver type to JavaScriptExecutor type
		JavascriptExecutor jdriver = (JavascriptExecutor) driver;

		//identifies the username and enters the data
		jdriver.executeScript("document.getElementById('email').value='sushmag@77gamil.com'");

		//identifies password and enters the data
		jdriver.executeScript("document.getElementById('pass').value='12345'");

		//identifies login and clicks
		jdriver.executeScript("document.getElementsByName('login')[0].click()");

	}
}
