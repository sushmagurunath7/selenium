package Testng_programs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/* program for SoftAssert */
public class p15 {
	@Test
	public void elorusLoginScript() {
		SoftAssert s = new SoftAssert();
	
		WebDriver driver = new ChromeDriver();
		
		//validates whether the browser is launched
		Set<String> handles = driver.getWindowHandles();
		s.assertEquals(handles.size(), 5); //--Deliberately failing 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://app.elorus.com/login");
		
		//validates whether login page is loaded
		WebElement welcomePageText = driver.findElement(By.xpath("//h1[text()='Welcome to Elorus']"));
		s.assertTrue(welcomePageText.isDisplayed());
		
		driver.findElement(By.id("id_email")).sendKeys("Sushma4@gmail.com");
		
		driver.findElement(By.id("id_password")).sendKeys("Sushmaselenium1234");
		
		driver.findElement(By.cssSelector("input[value='SIGN IN']")).click();
		
	//validates whether login is successful
		String expectedHomePageTitle = "Eloru"; //--Deliberately failing 
		String expectedHomePageUrl = "https://airplus.elorus.com/";
		String ActualHomePageTitle = driver.getTitle();
		String ActualHomePageUrl = driver.getCurrentUrl();
		
		s.assertEquals(ActualHomePageUrl, expectedHomePageUrl);
		s.assertEquals(ActualHomePageTitle, expectedHomePageTitle);  
		
		//closes the browser
		driver.quit();
		
		s.assertAll();
	}
}
