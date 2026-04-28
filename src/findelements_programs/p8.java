package findelements_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* program to print the name and price of Nike shoes in Myntra in sorted order of price */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p8 {
	public static void main(String[] args) {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and waits until it is loaded
		driver.get("https://www.Myntra.com");

		driver.findElement(By.className("desktop-searchBar")).sendKeys("Nike shoes");

		driver.findElement(By.className("desktop-submit")).click();

		List<WebElement> names = driver.findElements(By.xpath("//h4[@class='product-product']"));

		List<WebElement> prices = driver.findElements(By.xpath("//h4[@class='product-product']/..//div[@class='product-price']"));

		//creates an LinkedList Object with generic MyntraNike
		LinkedList<MyntraNike> shoes = new LinkedList<MyntraNike>();


		//creates an Iterator object with respect to(wrt) names
		Iterator<WebElement> itr1 = names.iterator();

		//creates an Iterator object wrt prices
		Iterator<WebElement> itr2 = prices.iterator();

		//Iterates List<WebElement> names and prices 
		while (itr1.hasNext()&&itr2.hasNext()) {
			String name = itr1.next().getText();
			String price= itr2.next().getText();

			//adds MyntraNike object into LinkedList
			shoes.add(new MyntraNike(name, price));
		}
		System.out.println("------------------------");

		//creates an object of MyntraNikeComparator
		Comparator comp = new MyntraNikeComparator();

		//sorts the LinkedList<MyntraNike> shoes
		Collections.sort(shoes, comp);

		//Iterates an LinkedList<MyntraNike> watches 
		for (MyntraNike lv : shoes) {
			System.out.println(lv);

		}
		//closes the browser
		driver.quit();
	}

}
