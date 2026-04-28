package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {
	public static void main(String[] args) {
		// sets path for chromedriver.exe
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

				//launches the chrome browser
				WebDriver driver = new ChromeDriver();

				//maximizes the browser window 
				driver.manage().window().maximize();

				//retrieves the web app and wait until it is loaded
				driver.get("file:///C:/Users/sushm/OneDrive/Desktop/selenium1.html");
				
				//identifies the webelement with id='i1'
				WebElement link= driver.findElement(By.id("i1"));
				
				//Retrieves the next value of the web element 
				//String text=link.getText();
				System.out.println(link.getText());
				
				//closes the browser
				driver.quit();
	}

}
