package javaScriptExecutor;
/* program for scrolling*/

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
	public static void main(String[] args) throws Throwable {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and waits until it is loaded
		driver.get("https://www.actitime.com");

		//identifies the subscribe button
		WebElement subscribe = driver.findElement(By.xpath("//button[@class='right__button']"));

		//retrieves the location of the subscribe button
		int x=subscribe.getLocation().getX();
		int y = subscribe.getLocation().getY();
		System.out.println(x+","+y);
		
		System.out.println("----------------------------");
		
		//converts the object from WebDriver type to JavaScriptExecutor type
		JavascriptExecutor jdriver = (JavascriptExecutor) driver;
		
		//scrolls to the subscribe button
		/* jdriver.executeScript("window.scrollBy(1102,8210)"); */
		
		/*jdriver.executeScript("window.scrollBy(x,y)"); --doesn't work cz of x & y are character variable or string variable */
		
		jdriver.executeScript("window.scrollBy("+x+","+y+")");
	}

}
