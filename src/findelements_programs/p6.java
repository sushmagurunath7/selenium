package findelements_programs;
//program to print the name and price of Gshock watches on Ajio in sorted order of the price

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p6 {
	public static void main(String[] args) {
		//sets the path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("https://www.Ajio.com");

		//identifies the search box and enters the data
		driver.findElement(By.name("searchVal")).sendKeys("Gshock");

		//identifies the search button and enters the click
		driver.findElement(By.className("rilrtl-button")).click();
		//identifies the names of all the watches
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='nameCls']"));

		//identifies the prices of all the watches
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='nameCls']/../..//span[@class='price  ']"));

		//creates an Iterator object with respect to(wrt) names
		Iterator<WebElement> itr1 = names.iterator();

		//creates an Iterator object wrt prices
		Iterator<WebElement> itr2 = prices.iterator();

		//creates an ArrayList Object with generic AjioGshock
		ArrayList<AjioGshock> watches = new ArrayList<AjioGshock>();

		//Iterates List<WebElement> names and prices 
		while (itr1.hasNext()&&itr2.hasNext()) {
			String name = itr1.next().getText();
			String price= itr2.next().getText();

			//adds AjioGshock object into ArrayList
			watches.add(new AjioGshock(name, price));

			/* AjioGshock xxx = new AjioGshock(name, price);
					watches.add(xxx); --- above one is optimised */

		}
		
		System.out.println("----------------------------------------");
		Collections.sort(watches);
		
		//Iterates an ArrayList<AjioGShock> watches 
		for (AjioGshock lv : watches) {
			System.out.println(lv);
			
		}
		//closes the browser
		driver.quit();

	}

}
