package webdriver_programs;

/* program for getTitle(), getCurrentUrl() and getPageSource() */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {
	public static void main(String[] args) {
	 // sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//launches the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//retrieves the web app and waits until it is loaded
		driver.get("https://www.Facebook.com");
		
		//retrieves the title of the  webpage
		String title = driver.getTitle();
		System.out.println(title);
		
		//retrieves the url of the webpage
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//retrieves the source code of the webpage
		String ps = driver.getPageSource();
		System.out.println(ps);
	}

}
