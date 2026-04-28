package Testng_programs;
/* program for parameters */

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class p9 {
	@Parameters("BrowserName")
	@Test
	public void demoScript(String BN) {
		System.out.println(" from script, the data received is="+BN);
	}
}
