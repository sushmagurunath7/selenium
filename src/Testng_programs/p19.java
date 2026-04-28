package Testng_programs;

import org.testng.Assert;
import org.testng.annotations.Test;

/* program for dependsOnMethods */
public class p19 {
	@Test
	public void loginScript() {
		System.out.println("From Login Script");
	}
	
	@Test(dependsOnMethods = {"loginScript"})
	public void logoutScript() {
		System.out.println("From Logout Script");
	}
	
	@Test(dependsOnMethods = {"loginScript"})
	public void invoicesScript() {
		System.out.println("From invoices Script");
	}
	
	@Test(dependsOnMethods = {"loginScript","contactScript"})
	public void contactScript() {
		System.out.println("From contact Script");
		Assert.fail();
	}
	
	@Test(dependsOnMethods = {"loginScript"})
	public void addContactScript() {
		System.out.println("From add conatct Script");
	}

}
