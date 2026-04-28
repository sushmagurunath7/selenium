package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elorusAddContact_page2 {
	
	//identifies the First name
	@FindBy (name="first_name")
	private WebElement tbFirstName;
	
	//identifies the last name
		@FindBy (name="last_name")
		private WebElement tbLastName;
	
	
	//identifies the company
	@FindBy (name="company")
	private WebElement tbcompany;
	
	//identifies the profession
	@FindBy (name="profession")
	private WebElement tbprofession;
	
	@FindBy (xpath = "//span[text()='Save']/parent::a")
	private WebElement btnSave;
	
	public void setFirstName(String fn) {
		this.tbFirstName.sendKeys(fn);
	}
	
	public void setLastName(String ln) {
		this.tbLastName.sendKeys(ln);
	}
	
	public void setCompany(String com) {
		this.tbcompany.sendKeys(com);
	}
	
	public void setProfession(String prof) {
		this.tbprofession.sendKeys(prof);
	}
	
	public void clickSave() {
		this.btnSave.click();
	}
	
	
	//constructor
	public elorusAddContact_page2(WebDriver driver) {
		
		//Initializes the webelement
		PageFactory.initElements(driver,this);
		
	}
}
