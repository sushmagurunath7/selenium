package Testng_programs;
/* program for assert class */

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class p14 {
	
	@Test
	public void elorusLoginScript() {
		WebDriver driver = new ChromeDriver();
		
		//validates whether the browser is launched
		Set<String> handles = driver.getWindowHandles();
		Assert.assertEquals(handles.size(), 1);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://app.elorus.com/login");
		
		//validates whether login page is loaded
		WebElement welcomePageText = driver.findElement(By.xpath("//h1[text()='Welcome to Elorus']"));
		Assert.assertTrue(welcomePageText.isDisplayed());
		
		driver.findElement(By.id("id_email")).sendKeys("Sushma4@gmail.com");
		
		driver.findElement(By.id("id_password")).sendKeys("Sushmaselenium1234");
		
		driver.findElement(By.cssSelector("input[value='SIGN IN']")).click();
		
/*		//validates whether login is successful
		String expectedHomePageTitle = "Elorus";
		String expectedHomePageUrl = "https://airplus.elorus.com/";
		String ActualHomePageTitle = driver.getTitle();
		String ActualHomePageUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(ActualHomePageUrl, expectedHomePageUrl);
		Assert.assertEquals(ActualHomePageTitle, expectedHomePageTitle);  --works without this but keep */
		
		//closes the browser
		driver.quit();
		
	}
	

}
