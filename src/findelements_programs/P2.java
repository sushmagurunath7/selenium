package findelements_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {
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

		//creates ArrayList object to store text 
		ArrayList<String>linktexts =new ArrayList();

		//iterates the List<WebElement> and links
		for(WebElement lv:links)
		{
			String text=lv.getText();

			//adds the text value to ArrayList
			linktexts.add(text);
		}

		//sorts the ArrayList<String> linktexts
		Collections.sort(linktexts);

		//iterates the ArrayList<String> linktexts
		for(String lv:linktexts) {
			System.out.println(lv);
		}
	}

}
