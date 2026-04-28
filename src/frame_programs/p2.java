package frame_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {
	public static void main(String[] args) {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("file:///C:/Users/sushm/OneDrive/Desktop/page2.html");

		//identifies the webelement with id= 't2' and enters the data 
		driver.findElement(By.id("t2")).sendKeys("Selenium");

		//switches the control to page1 with id= f1 
		//frame agruments is name or id hence works for both 
		/*driver.switchTo().frame("f1"); */
		
		//switches the control to page1 with id= f1
		/* driver.switchTo().frame("n1"); */
		
		//switches the control page1 with index=0
		driver.switchTo().frame(0);

		//identifies the webelement with id= 't1' and enters the data
		driver.findElement(By.id("t1")).sendKeys("Java");
	}

}
