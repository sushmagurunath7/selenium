package screenshot_programs;
/*program for capturing the screenshot of webelement*/

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {
	public static void main(String[] args) throws Throwable {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("https://www.nykaa.com");
		
		WebElement element = driver.findElement(By.xpath("(//div[@class='outline-wrapper'])[1]"));
		
		//converts the screenshot and returns it in file class object 
				//--creates an object in heap memory the object contains the content of the screenshot that is stored in src variable of File type
				File src = element.getScreenshotAs(OutputType.FILE);
				
				//creates a File class object connected to p1.tiff
				File dest = new File("./screenshot/Nykaa.tiff");
				
				//copies the content from src to dest
				FileUtils.copyFile(src, dest);
				
				//closes the browser
				driver.quit();
	}
}
