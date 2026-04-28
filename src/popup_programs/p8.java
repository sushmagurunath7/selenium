package popup_programs;
/*program for file upload pop up (Robot class)*/
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class p8 {
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
		driver.get("https://www.timesjobs.com/");

		//identifies and clicks on registered button
		driver.findElement(By.xpath("//a[text()='Register']")).click();

		// identifies the and clicks on ok button -a pop-up 
		driver.findElement(By.xpath("//button[text()='Ok']")).click();

		//identifies and clicks on chose the file button
		driver.findElement(By.className("upload-file-btn")).click();

		//pauses the program for 1 sec
		Thread.sleep(1000);

		//uploads the file
		p7.fileUpload("C:\\selenium_workspace\\selenium_project\\upload\\SushmaResume.docx");

	}

}
