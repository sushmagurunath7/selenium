package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elorusAddContact_page {

	//identifies the First name
	@FindBy (name="first_name")
	public WebElement tbFirstName;

	//identifies the last name
	@FindBy (name="last_name")
	public WebElement tbLastName;

	//identifies the company
	@FindBy (name="company")
	public WebElement tbcompany;

	//identifies the profession
	@FindBy (name="profession")
	public WebElement tbprofession;

	@FindBy (xpath = "//span[text()='Save']/parent::a")
	public WebElement btnSave;

	//constructor
	public elorusAddContact_page(WebDriver driver) {

		//Initializes the webelement
		PageFactory.initElements(driver,this);

	}
}
