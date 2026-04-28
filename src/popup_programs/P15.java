package popup_programs;
/* PROGRAM FOR CALENDER POP-UP */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P15 {
	public static void main(String[] args) {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//defines an implicitly wait of 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("https://www.makemytrip.com/");

		//identifies and clicks on Try it button
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();

		//identifies and clicks on departure button
		driver.findElement(By.xpath("//label[@for = 'departure']")).click();

		selectDate(driver, "28", "November", "2026");

	}

	//method to select the date in the calendar 
	public static void selectDate(WebDriver driver, String day, String month, String year) {
		boolean ismonth=true; 
		WebElement nextButton = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		try {
			while (true) {
				try {
					driver.findElement(By.xpath("//div[text() = '"+month+ " "+ year+ "']"));
					break;
				} 
				catch (Exception e) {
					try {
					nextButton.click();
					}
					catch (Exception f)
					{
						System.out.println("No further months available: Change date");
						ismonth=false;
						break;
					}
				}
			}
			if(ismonth)
			{
				// Identifies the day 
				WebElement expectedDay = driver.findElement
				(By.xpath("//div[text()='"+month+" "+ year + "']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+day+"']"));
				
				// Scrolls to the expectedDay
				new Actions(driver).scrollToElement(expectedDay).perform();
				
				//clicks on expected day 
				expectedDay.click();
			}
		}
		catch(Exception e) {
			System.out.println("Error in handling request");
		}
		finally {
			driver.quit();
		}
	}

}
