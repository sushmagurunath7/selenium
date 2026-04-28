package Testng_programs;
/* program for Priority */

import org.testng.annotations.Test;

public class p17 {
	
	@Test(priority = 0) //not assigned any order then default is 0 and output will be in alphabetical order
	public void loginScript() {
		System.out.println("From Login Script");
	}
	
	@Test(priority = 0)
	public void logoutScript() {
		System.out.println("From Logout Script");
	}
	
	@Test
	public void invoicesScript() {
		System.out.println("From invoices Script");
	}
	
	@Test
	public void contactScript() {
		System.out.println("From contact Script");
	}
	@Test
	public void addContactScript() {
		System.out.println("From add conatct Script");
	}

}
