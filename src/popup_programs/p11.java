package popup_programs;

/* program for file upload pop up (AutoIt) -- naukri */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p11 {
	public static void main(String[] args) throws Throwable {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//defines an implicitly wait of 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("https://www.naukri.com/");

		//identifies and clicks on registered button
		driver.findElement(By.id("register_Layer")).click();

		//identifies and clicks on experienced button
		driver.findElement(By.xpath("//div[@class='focusable optionWrap  '][1]")).click();


		/*driver.findElement(By.xpath("//h2[contains(text(),'experienced')]/ancestor::div[@class='focusable optionWrap selected ']")).click(); */ 

		//identifies and clicks on Upload resume button
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();

		//pauses for 1 second 
		Thread.sleep(1000);
	
		Runtime.getRuntime().exec("./upload/fileupload.exe");
	}

}
