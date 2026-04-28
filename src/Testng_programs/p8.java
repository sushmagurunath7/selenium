package Testng_programs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class p8 extends BaseTest2 {
	@Test
	public void elorusLoginScript() {

		driver.get("https://app.elorus.com/login");

		driver.findElement(By.id("id_email")).sendKeys("Sushma@gmail.com");

		driver.findElement(By.id("id_password")).sendKeys("Sushmaselenium123");

		driver.findElement(By.cssSelector("input[value='SIGN IN']")).click();
	}

}
