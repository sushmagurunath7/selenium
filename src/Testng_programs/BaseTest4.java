package Testng_programs;
/* program for @BeforeTest and @AfterTest */

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest4 {
	@Parameters("BrowserName")
	@BeforeTest
	public void BeforeTest(String BN) {
		System.out.println(BN+"Test started the execution");
	}

	@Parameters("BrowserName")
	@AfterTest
	public void AfterTest(String BN) {
		System.out.println(BN+"Test completed the execution");
	}
	
	@Parameters("ProjectName")
	@BeforeSuite
	public void BeforeSuite(String project) {
		System.out.println(project+" Suite started the execution");
	}
	
	@Parameters("ProjectName")
	@AfterSuite
	public void AfterSuite(String project) {
		System.out.println(project+" Suite completed the execution");
	}
	
	
}
