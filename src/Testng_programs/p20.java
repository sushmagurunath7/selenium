package Testng_programs;

import org.testng.annotations.Test;

/* program for Groups*/
public class p20 {
	@Test(groups = {"Smoke"})
	public void loginScript() {
		System.out.println("From Login Script");
	}
	
	@Test(groups = { "Smoke","Integration"})
	public void logoutScript() {
		System.out.println("From Logout Script");
	}
	
	@Test(groups = {"Integration"})
	public void invoicesScript() {
		System.out.println("From invoices Script");
	}
	
	@Test(groups = {"Integration"})
	public void contactScript() {
		System.out.println("From contact Script");
	}
	@Test(groups = {"System"})
	public void addContactScript() {
		System.out.println("From add conatct Script");
	}
}
