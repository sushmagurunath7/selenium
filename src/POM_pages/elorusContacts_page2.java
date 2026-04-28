package POM_pages;
/* POM class for elorus contacts page*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elorusContacts_page2 {

	//identifies Add button
	@FindBy(xpath = "//span[text()='Add']/parent::a")
	private WebElement btnAdd;

	//identifies Bulk import button
	@FindBy(xpath = "//span[text()='Bulk import']/parent::a")
	private WebElement btnBulkImport;
	
	//method to click on add button
	public void clickAdd() {
		this.btnAdd.click();
	}
	
	public void clickBulkImport() {
		this.btnBulkImport.click();
	}

	//constructor 
	public elorusContacts_page2(WebDriver driver) {

		//Initializes the webelements
		PageFactory.initElements(driver,this);
	}
}
