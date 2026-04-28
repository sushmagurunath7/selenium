package Select_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/* program for drop down */
public class p6 {
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
		driver.get("https://www.facebook.com/");

		//identifies and clicks on create new account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		//identifies the list Box
		WebElement dayDropDown= driver.findElement(By.id("day"));

		//handles the day drop down
		Select s1 = new Select(dayDropDown);
		s1.selectByValue("4");

		//handles the month drop down
		WebElement monthDropDown= driver.findElement(By.id("month"));
		Select s2 = new Select(monthDropDown);
		s2.selectByValue("6");

		//handles the year drop down
		WebElement yearDropDown= driver.findElement(By.id("year"));
		Select s3 = new Select(yearDropDown);
		s3.selectByValue("1994");

	}
}
