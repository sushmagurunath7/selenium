package Testng_programs;

import org.testng.annotations.Test;
/* program for Priority */
public class p16 {
	@Test(priority = -10)
	public void loginScript() {
		System.out.println("From Login Script");
	}
	
	@Test(priority = 10)
	public void logoutScript() {
		System.out.println("From Logout Script");
	}
	
	@Test(priority = -5)
	public void invoicesScript() {
		System.out.println("From invoices Script");
	}
	
	@Test(priority = 0)
	public void contactScript() {
		System.out.println("From contact Script");
	}
	@Test(priority = 5)
	public void addContactScript() {
		System.out.println("From add conatct Script");
	}
	
}
