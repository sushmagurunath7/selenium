package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/* POM class of Elorus Login Page*/

public class elorusLogin_page2 {

	//identifies the username
	@FindBy(name="email")
	private WebElement tbUsername;


	//identifies the password
	@FindBy(id = "id_password")
	private WebElement tbPassword;

	//identifies the Sign In
	@FindBy(xpath= "//input[@value='SIGN IN']")
	private WebElement btnSignIN;

	//method to set username
	public void setUsername(String un) {
		this.tbUsername.sendKeys(un);
	}
	
	//method set password
	public void setPassword(String pwd) {
		this.tbPassword.sendKeys(pwd);
	}
	
	//method  click sign in
	public void clickSignIn() {
		this.btnSignIN.click();
	}
	
	//constructor
	public elorusLogin_page2(WebDriver driver) {

		//initializes the webelements
		PageFactory.initElements(driver, this);

	}
}
