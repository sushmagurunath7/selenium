package popup_programs;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* program for file upload pop-up */
public class p7 {

	public static void fileUpload(String Location) throws Throwable { /* making a location or file uploading dynamic */

		//writes the location into the clipboard
		StringSelection data = new StringSelection(Location); 

		/* public static void fileUpload() throws Throwable {

		//writes the location into the clipboard
		StringSelection data = new StringSelection("C:\\selenium_workspace\\selenium_project\\upload\\SushmaResume.docx"); */

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(data, null);

		//creates an object of Robot class
		Robot r = new Robot();

		//presses the control+v
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		//releases control+v
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		//presses Enter
		r.keyPress(KeyEvent.VK_ENTER);

		//Releases Enter
		r.keyRelease(KeyEvent.VK_ENTER);
	}


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

		//uploads the file 
		fileUpload("C:\\selenium_workspace\\selenium_project\\upload\\SushmaResume.docx");

	}

}
