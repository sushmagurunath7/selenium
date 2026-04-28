package webelement_programs;
import org.openqa.selenium.By;
/*program for getTagname()*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class p7 {
	public static void main(String[] args)  {
		// sets path for chromedriver.exe
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launches the chrome browser
		WebDriver driver = new ChromeDriver();

		//maximizes the browser window 
		driver.manage().window().maximize();

		//retrieves the web app and waits until it is loaded
		driver.get("https://www.facebook.com");

		//identifies the login button
		WebElement login = driver.findElement(By.name("login"));

		System.out.println("-------------------------------");

		//retrieves the tagname of the webelement
		String tn= login.getTagName();
		System.out.println(tn);
		System.out.println("---------------------");

		//retrieves the attribute of the webelement

		String att1 = login.getAttribute("class");
		String att2 = login.getAttribute("data-testid");
		System.out.println(att1);
		System.out.println(att2);
		System.out.println("-------------------");
		
		//retrieves the cssProperty of the webelement
		String css1 = login.getCssValue("font-family");
		String css2 = login.getCssValue("font-size");
		System.out.println(css1);
		System.out.println(css2);
		
		driver.quit();
	}
}
