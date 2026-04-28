package Select_programs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/* program for  getOptions() */
public class p5 {
	public static void main(String[] args)  {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//defines an implicitly wait of 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and waits until it is loaded
		driver.get("file:///C:/Users/sushm/OneDrive/Desktop/selenium6.html");
		
		//identifies the list Box
		WebElement listBox = driver.findElement(By.id("KB"));
		
		//creates an object of Select class
		Select s = new Select (listBox);
		
		//retrieves all the options from the listBox 
		List<WebElement> allOptions = s.getOptions();
		
		//creates an object of ArrayList
		ArrayList<String> options = new ArrayList<String>();
		
		for (WebElement lv : allOptions) {
			
			String text = lv.getText();
			//adds the text value of option into ArrayList
			options.add(text);
		}
		System.out.println(options);
		
		//sorts the ArrayList
		Collections.sort(options);
		
		System.out.println(options);
		
		driver.quit();
		
	}

}
