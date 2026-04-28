package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elorusHome_page {

	//identifies Invoices
	@FindBy(xpath="//a[@title='Invoices']")
	public WebElement lnkInvoices;

	//identifies Expenses
	@FindBy(xpath="//a[@title='Expenses']")
	public WebElement lnkExpenses;

	//identifies Projects
	@FindBy(xpath="//a[@title='Projects']")
	public WebElement lnkProjects;

	//identifies Time
	@FindBy(xpath="//a[@title='Time']")
	public WebElement lnkTime;
	
	//identifies Contacts
	@FindBy(xpath="//a[@title='Contacts']")
	public WebElement lnkContacts;

	//identifies Estimates
	@FindBy(xpath="//a[@title='Estimates']")
	public WebElement lnkEstimates;

	//identifies user menu
	@FindBy(xpath= "//a[@title='User menu']")
	public WebElement btnUserMenu;

	//identifies Logout
	@FindBy(xpath="//a[text()='Logout']")
	public WebElement btnLogout;
	
	//constructor
	public elorusHome_page(WebDriver driver) {
		
		//Initializes the webelements
		PageFactory.initElements(driver,this);
	}

}
