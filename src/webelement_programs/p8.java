package webelement_programs;
/* program for submit() */
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p8 {
	public static void main(String[] args) {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();
		
		//retrieves the web app and wait until it is loaded
		driver.get("https://www.facebook.com");
		
		//identifies the username and enters the data
		driver.findElement(By.id("email")).sendKeys("sushmag@77gmail.com");
		
		//identifies the password and enters the data
		driver.findElement(By.id("pass")).sendKeys("1234567");
		
		//identifies the login and clicks 
		driver.findElement(By.name("login")).click();
		
		//identifies the login and submits
		/*driver.findElement(By.name("login")).submit(); */
		
		//identifies the login and clicks
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
	}

}
