package Testng_programs;
/* program for DataProvider */

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class p11 {
	
	@DataProvider
	public Object[] sampleDataProvider() {
		Object[] data = {"Sushma",500, 25.5f,true};
		return data;
	}

	@Test(dataProvider = "sampleDataProvider")
	public void demoScript(Object x) {
		
		System.out.println("From demo script="+x);
		System.out.println("------------------------");
	}
}
