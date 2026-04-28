package webelement_programs;

//programs for cssSelector

import org.openqa.selenium.By;
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
		driver.get("file:///C:/Users/sushm/OneDrive/Desktop/selenium3.html");
		
		/*identifies the first textbox webelement with and enters the data
		WebElement textBox = driver.findElement(By.cssSelector("input[tabindex='1']"));
		
		//enters the data into the textBox
		textBox.sendKeys("Java");
		
		WebElement textBox1 = driver.findElement(By.cssSelector("input[tabindex='2']"));
		
		//enters the data into the textBox2
		textBox1.sendKeys("Selenium"); */
		
		driver.findElement(By.cssSelector("input[tabindex='1']")).sendKeys("Java");
		driver.findElement(By.cssSelector("input[tabindex='2']")).sendKeys("Selenium");
				
	}

}
