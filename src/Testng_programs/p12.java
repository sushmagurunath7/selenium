package Testng_programs;
/* program for DataProvider */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class p12 {
	
	@DataProvider(parallel = true)
	public Object[][] elorusLoginData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "Sushma4@gmail.com";
		data[0][1] = "Sushmaselenium1234";
		data[1][0] = "gummi1@gmail.com";
		data[1][1] = "Sushmaselenium1234";
		data[2][0] = "sam1@gmail.com";
		data[2][1] = "Sushmaselenium1234";
		
		return data;
	}
	
	@Test(dataProvider = "elorusLoginData")
	public void elorusLoginScript(String un, String pwd) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://app.elorus.com/login");
		
		driver.findElement(By.id("id_email")).sendKeys(un);
		
		driver.findElement(By.id("id_password")).sendKeys(pwd);
		
		driver.findElement(By.cssSelector("input[value='SIGN IN']")).click();
		
		driver.quit();
		
		
	}

}
