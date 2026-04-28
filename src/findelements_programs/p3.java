package findelements_programs;
//program to print the name and price of iphones in flipkart

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and wait until it is loaded
		driver.get("https://www.flipkart.com");

		//identifies the search box and enters the data
		driver.findElement(By.name("q")).sendKeys("iphone 16");

		//identifies the search button and enters the click
		driver.findElement(By.className("_2iLD__")).click();

		//identifies the name of all the iphones 
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));

		//identifies the prices of all the phones
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='KzDlHZ']/../..//div[@class='Nx9bqj _4b5DiR']"));

		//List<WebElement> links = driver.findElements(By.xpath("//a"));

		System.out.println("----------------------------");
		//iterates the List<WebElement> names
		for (WebElement lv : names) {
			System.out.println(lv.getText()); 
			/*String name=lv.getText();
			System.out.println(name); --another way */

			
		}

		//iterates the  List<WebElement> prices
		for (WebElement lv : prices) {
			System.out.println(lv.getText()); 
			
		}
		System.out.println("Total no of links="+prices.size());
		
		System.out.println("-------------------------------------");
		
		//creates an Iterator object with respect to(wrt) names
		Iterator<WebElement> itr1 = names.iterator();
		
		//creates an Iterator object wrt prices
		Iterator<WebElement> itr2 = prices.iterator();
		
		//Iterates List<WebElement> names and prices 
		while (itr1.hasNext()&&itr2.hasNext()) {
			String name = itr1.next().getText();
			String price= itr2.next().getText();
			System.out.println(name+"="+ price);
			
		}
		
		System.out.println("-------------------------------------------");
		
		//Iterates the List<WebElement> links and retrieves the text using ListIterator cursor
		ListIterator<WebElement> ltr1 = names.listIterator();
		ListIterator<WebElement> ltr2 = prices.listIterator();
		
		while (ltr1.hasNext()&&ltr2.hasNext()) {
			String name = ltr1.next().getText();
			String price = ltr2.next().getText();
			System.out.println(name+"="+price);
		}
		
		System.out.println("---------------------------------------------");
		
		ListIterator<WebElement> rltr1 = names.listIterator(names.size());
		ListIterator<WebElement> rltr2 = prices.listIterator(prices.size()); 
		
		while (rltr1.hasPrevious()&&rltr2.hasPrevious()) {
			String name = rltr1.previous().getText();
			String price = rltr2.previous().getText();
			System.out.println(name+"="+price);
		}

		//closes the browser
		driver.quit();
	}
}
