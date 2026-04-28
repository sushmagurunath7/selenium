package webdriver_programs;
//program for multiple tabs

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p10 {
	public static void main(String[] args) throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("https://help.elorus.com");

		//identifies and clicks on sign up button
		driver.findElement(By.linkText("Sign up")).click();
		multipleTabs(driver);

		//identifies sign in and clicks
		driver.findElement(By.partialLinkText("Sign in")).click(); //both works-- driver.findElement(By.linkText("Sign in here."));

		//identifies username and enters the data
		driver.findElement(By.id("id_email")).sendKeys("Sushma2@gmail.com");

		//identifies the password and enters the data
		driver.findElement(By.id("id_password")).sendKeys("Sushmaselenium1234");

		
		//identifies the login and clicks 
		driver.findElement(By.cssSelector("input[value='SIGN IN']")).click();
	}

	public static void multipleTabs(WebDriver driver) {
		//retrieves the handles of main window
		String oldTab = driver.getWindowHandle();

		//retrieves the handles of all the tabs
		Set<String> allTabs = driver.getWindowHandles();

		//Iterates the Set<String> allTabs using For Each loop
		for (String lv : allTabs) {

			//switches the control to specified Tab 	
			driver.switchTo().window(lv);

			//closes all the old tab
			if (lv.contentEquals(oldTab)) {
				driver.close();

			}
		}
	}
}


