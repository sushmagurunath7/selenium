package screenshot_programs;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {
	public static void main(String[] args) throws Throwable {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("https://www.Myntra.com");
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("men shades");
		driver.findElement(By.className("desktop-submit")).click();
		
		//identifies all the images
		
		List<WebElement> images = driver.findElements(By.xpath("//img"));
		
		//captures the screenshot of all the images 
		int count = 1;
		for (WebElement lv : images) {
			File src = lv.getScreenshotAs(OutputType.FILE);
			
			//creates a File class object connected to p1.tiff
			File dest = new File("./Myntra/shades"+count++ +".tiff");
			
			//copies the content from src to dest
			FileUtils.copyFile(src, dest);
		}
			
			//closes the browser
			driver.quit();
	}
}
