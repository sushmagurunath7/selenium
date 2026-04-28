package webdriver_programs;

//program for navigate(),back(),forward(),refresh()
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {
		public static void main(String[] args) {
			// sets path for chromedriver.exe
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			//launches the chrome browser
			WebDriver driver = new ChromeDriver();

			//retrieves the web app and waits until it is loaded
			driver.get("https://www.Ajio.com");
			
			//navigates to the specified url
			driver.navigate().to("https://www.myntra.com");
			
			//navigates back
			driver.navigate().back();
			
			//navigates forward
			driver.navigate().forward();
			
			//refreshes the webpage
			driver.navigate().refresh();
	}
}
