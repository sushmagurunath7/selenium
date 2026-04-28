package findelements_programs;

import java.util.Iterator;

//program to print total no of links in facebook login page 

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();
		
		//retrieves the web app and wait until it is loaded
		driver.get("https://www.facebook.com");
		
		//identifies  all the links 
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		//retrieves the type of the list
		System.out.println(links.getClass().getName());
		
		//retrieves the size of the  list
		System.out.println("Total no of links="+links.size());
		
		System.out.println("------------------------");
		
		//retrieves the text of every link
		for (WebElement lv : links) {
			System.out.println(lv.getText());
		}
		
		System.out.println("----------------------------");
		
		//Iterates the List<WebElement> links and retrieves the text using Iterator cursor
		Iterator<WebElement> itr = links.iterator();
		while (itr.hasNext()) {
			WebElement x = itr.next();
			String text= x.getText();
			System.out.println(text);
			
		}
		System.out.println("--------------------------------");
		
		//Iterates the List<WebElement> links and retrieves the text using ListIterator cursor
		ListIterator<WebElement> ltr = links.listIterator();
		while (ltr.hasNext()) {
			WebElement x = ltr.next();
			String text = x.getText();
			System.out.println(text);
			
		}
		System.out.println("----------------------------");
		
		
		//Iterates the List<WebElement> links in REVERSE retrieves the text using ListIterator cursor
		ListIterator<WebElement> rltr = links.listIterator(links.size());
		while (rltr.hasPrevious()) {
			WebElement x = rltr.previous();
			String text = x.getText();
			System.out.println(text);
		}
		
		//Iterates the List<WebElement> links and retrieves the text using FOR loop
		for (int i = 0; i < links.size(); i++) {
			WebElement x = links.get(i);
			String text = x.getText();
			System.out.println(text);
			
		}
		
		System.out.println("--------------------------");
		
		//Iterates the List<WebElement> links in REVERSE and retrieves the text using FOR loop
		for (int i = links.size()-1;i >= 0; i--) {
			WebElement x = links.get(i);
			String text = x.getText();
			System.out.println(text);
			
		}
		
		System.out.println("----------------------------");
		
		//Iterates the List<WebElement> links and retrieves the text using WHILE loop
		int i=0;
		while (i<links.size()) {
			WebElement x = links.get(i);
			String text = x.getText();
			System.out.println(text);
			i++;
		}
		
		System.out.println("-------------------------");
		
		//Iterates the WEbElement links and retrieves the text using DO WHILE loop
		int j=0;
		do {
			WebElement x = links.get(j);
			String text = x.getText();
			System.out.println(text);
			j++;
			
		} while (j<links.size());
		
		//closes the browser
		driver.quit();
	}
}
