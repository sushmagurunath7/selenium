package POM_pages;
/* POM class for elorus contacts page*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elorusContacts_page {

	//identifies Add button
	@FindBy(xpath = "//span[text()='Add']/parent::a")
	public WebElement btnAdd;

	//identifies Bulk import button
	@FindBy(xpath = "//span[text()='Bulk import']/parent::a")
	public WebElement btnBulkImport;

	//constructor 
	public elorusContacts_page(WebDriver driver) {

		//Initializes the webelements
		PageFactory.initElements(driver,this);
	}
}
