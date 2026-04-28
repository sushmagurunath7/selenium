package popup_programs;
/* program for authentification pop-up ( Robot class) */

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p13 {
	public static void main(String[] args) throws Throwable {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//defines an implicitly wait of 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//maximizes the browser window 
		driver.manage().window().maximize();

		//fetches the web app and waits until it is loaded
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		authentificationPopup();

	}

	public static void authentificationPopup() throws Throwable {

		//writes the username into the clip board
		StringSelection username = new StringSelection("admin");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);

		//creates an object of Robot class
		Robot r = new Robot();

		//presses the control+v
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		//releases control+v
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		//presses and releases the tab 
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		//writes the password into the clip board
		StringSelection password = new StringSelection("admin");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(password, null);

		//presses the control+v
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		//releases control+v
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		//presses and releases the tab 
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		//presses and releases the Enter 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
