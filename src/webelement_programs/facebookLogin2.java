package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLogin2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();
		
		//retrieves the web app and wait until it is loaded
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("sushmag@77gamil.com");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("1234567");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
	}

}
