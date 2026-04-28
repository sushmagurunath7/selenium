package screenshot_programs;
/* program for capturing screenshot*/

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
	public static void main(String[] args) throws Throwable {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("https://www.Ajio.com");
		
		//converts the object from WEbDriver type to TakesScreenshot type
		TakesScreenshot tdriver= (TakesScreenshot) driver;
		
		
		//converts the screenshot and returns it in file class object 
		//--creates an object in heap memory the object contains the content of the screenshot that is stored in src variable of File type
		File src = tdriver.getScreenshotAs(OutputType.FILE);
		
		//creates a File class object connected to p1.png
		File dest = new File("./screenshot/p1.png");
		
		//copies the content from src to dest
		FileUtils.copyFile(src, dest);
		 
		
		//closes the browser
		driver.quit();
		
	}

}
