package Testng_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class p10 extends BaseTest4 {
	@Parameters("BrowserName")
	@Test
	public void fbLoginScript(String BN) {
		
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		

		if (BN.equalsIgnoreCase("Chrome")) 
			driver= new ChromeDriver();
		else if (BN.equalsIgnoreCase("Firefox")) 
			driver = new FirefoxDriver();
		else if (BN.equalsIgnoreCase("Edge")) 
			driver= new EdgeDriver();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("sushmag@77gamil.com");
		driver.findElement(By.id("pass")).sendKeys("1234567");
		driver.findElement(By.name("login")).click();
	
		driver.quit();
	}
	
}
