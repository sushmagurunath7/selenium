  package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
	public static void main(String[] args) {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("file:///C:/Users/sushm/OneDrive/Desktop/selenium1.html");
		
		/*By xxx = By.id(i1);
        WebElement link = driver.findElement(xxx); */
		
		//identifies the webelement with id='i1'
		/*WebElement link = driver.findElement(By.id("i1")); */
		
		//identifies the webelement with name= 'n1'
		/*WebElement link = driver.findElement(By.name("n1")); */
		
		//identifies the webelement with class= 'c1'
		/*WebElement link = driver.findElement(By.className("c1")); */
		
		//identifies the webelement with tagname= 'a'
		/*WebElement link = driver.findElement(By.tagName("a"));*/
		
		//identifies the webelement with linkText='Facebooook'
		WebElement link = driver.findElement(By.linkText("Faceboook"));
		
		//identifies the webelement with the partialLinkText='Face'
		//WebElement link = driver.findElement(By.partialLinkText("Face"));
				
		//clicks on the webelement
		link.click();
		
	}
	
}
