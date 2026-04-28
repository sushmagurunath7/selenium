package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/* POM class of Elorus Login Page*/

public class elorusLogin_page {

	//identifies the username
	@FindBy(name="email")
	public WebElement tbUsername;

	//identifies the password
	@FindBy(id = "id_password")
	public WebElement tbPassword;

	//identifies the Sign In
	@FindBy(xpath= "//input[@value='SIGN IN']")
	public WebElement btnSignIN;

	//constructor
	public elorusLogin_page(WebDriver driver) {
		
		//initializes the webelements
		PageFactory.initElements(driver, this);

	}
}
