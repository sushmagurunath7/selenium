package Testng_programs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class p7 extends BaseTest2{
	@Test
	public void fbLoginScript() {
		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("sushmag@77gamil.com");


		driver.findElement(By.id("pass")).sendKeys("1234567");

		driver.findElement(By.name("login")).click();

	}

}
