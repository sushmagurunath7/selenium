package webelement_programs;

/*program for findElements() */

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p12 {
	public static void main(String[] args)  {
		// sets path for chromedriver.exe
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and waits until it is loaded
		driver.get("https://www.facebook.com");

		//identifies the footer of the login page
		WebElement footer = driver.findElement(By.id("pageFooter"));

		//identifies all the links in the footer
		List<WebElement> footerLinks = footer.findElements(By.xpath("//a"));

		//retrieves the size of  List<WebElement> footerLinks
		System.out.println(footerLinks.size());

		//iterates  List<WebElement> footerLinks
		for (WebElement lv : footerLinks) {
			System.out.println(lv.getText());
		}

		//closes the browser
		driver.quit();
		
		//compiled class files are called as binary files
		//collection of class files ----jar files

	}

}
