package webdriver_programs;
//program for getWindowHandle() and getWindowHandles()-handles the references of the windows

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p5 {
	public static void main(String[] args) {
		
		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");

		//identifies and clicks on follow all button
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('followall').click()");
		
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		
		//retrieves the handles of all the windows
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		System.out.println(allWindows.getClass().getName());
		
		System.out.println("-----------------------");
		
		//Iterates the Set<String> allWindows using For Each loop
		for (String lv : allWindows) {
			System.out.println(lv);
		}
		System.out.println("---------------------------");
		
		//Iterates the Set<String> allWindows 
		Iterator<String> itr = allWindows.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
	}
}
