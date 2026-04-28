package Testng_programs;
/* program for testng annotation */

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class p1 {
	@BeforeSuite
	public void BeforeSuit() {
		System.out.println(" from before suit");
	}
	
	@AfterSuite
	public void AfterSuit() {
		System.out.println(" from After suit");
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println(" from Before Test");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println(" from After Test");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println(" from before class");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println(" from After class");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println(" from before method");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println(" from After method");
	}
	
	@Test
	public void script() {
		System.out.println(" from test script");
	}

}
