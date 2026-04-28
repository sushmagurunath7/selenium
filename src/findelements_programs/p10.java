package findelements_programs;
//program to validate navigation bar elements are in the expected order

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p10 {
	public static void main(String[] args) throws Throwable {
		// sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and waits until it is loaded
		driver.get("https://www.Myntra.com");

		//identifies all the navBar elements
		List<WebElement> navBarElements = driver.findElements(By.xpath("//a[@class='desktop-main']"));

		//creates an ArrayList object to store text of NavBar elements
		List<String> actualNavBar = new ArrayList<String>();

		//iterates List<WebElement> navBarElements
		for (WebElement lv : navBarElements) {
			actualNavBar.add(lv.getText());
		}

		//Array containing expected nav bar elements
		String[] ExpectedNavBarArr= {"MEN","WOMEN","KIDS","HOME","BEAUTY","GENZ","STUDIO"};

		//converts the ExpectedNavBarArr array to List
		List<String> ExpectedNavBar = Arrays.asList(ExpectedNavBarArr); //--asList--to convert the array to a List


		//validates whether actualNavBar is equal to the ExpectedNavBar
		if (actualNavBar.equals(ExpectedNavBar)) {
			System.out.println("Nav Bar elements are as Expected");

		} 
		else 
			System.out.println("Nav Bar elements are as scrambled");

		//closes the browser
		driver.quit();
	}
}
