package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elorusHome_page2 {

	//identifies Invoices
	@FindBy(xpath="//a[@title='Invoices']")
	private WebElement lnkInvoices;

	//identifies Expenses
	@FindBy(xpath="//a[@title='Expenses']")
	private WebElement lnkExpenses;

	//identifies Projects
	@FindBy(xpath="//a[@title='Projects']")
	private WebElement lnkProjects;

	//identifies Time
	@FindBy(xpath="//a[@title='Time']")
	private WebElement lnkTime;

	//identifies Contacts
	@FindBy(xpath="//a[@title='Contacts']")
	private WebElement lnkContacts;

	//identifies Estimates
	@FindBy(xpath="//a[@title='Estimates']")
	private WebElement lnkEstimates;

	//identifies user menu
	@FindBy(xpath= "//a[@title='User menu']")
	private WebElement btnUserMenu;

	//identifies Logout
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement btnLogout;

	//method to click Invoices
	public void click() {
		this.lnkInvoices.click();
	}

	//method to click Expenses
	public void clickExpenses() {
		this.lnkExpenses.click();
	}

	//method to click Projects
	public void clickProjects() {
		this.lnkProjects.click();
	}

	//method to click Time
	public void clickTime() {
		this.lnkTime.click();
	}

	//method to click Contacts
	public void clickContacts() {
		this.lnkContacts.click();
	}

	//method to click Estimates
	public void clickEstimates() {
		this.lnkEstimates.click();
	}

	//method to click user name
	public void clickUserMenu() {
		this.btnUserMenu.click();
	}

	//method to click logout
	public void clickLogout() {
		this.btnLogout.click();
	}
	//constructor
	public elorusHome_page2(WebDriver driver) {

		//Initializes the webelements
		PageFactory.initElements(driver,this);
	}

}
