package Testng_programs;

import org.testng.annotations.Test;
/* program for Invocation count */
public class p18 {
	@Test(invocationCount = 5) 
	public void loginScript() {
		System.out.println("From Login Script");
	}
	
	@Test(priority = -5, invocationCount = 10)
	public void logoutScript() {
		System.out.println("From Logout Script");
	}
	
	@Test(invocationCount = 2)
	public void invoicesScript() {
		System.out.println("From invoices Script");
	}

}
