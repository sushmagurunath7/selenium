package Testng_programs;

import org.testng.annotations.DataProvider;

import apache_programs.p4;

/* class for DataProviders of Elorus project */
public class elorusDataProviders {
	@DataProvider
	public Object[] sampleDataProvider() {
		Object[] data = {"Sushma",500, 25.5f,true};
		return data;
	}
	
	@DataProvider
	public Object[][] elorusLoginData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "Sushma4@gmail.com";
		data[0][1] = "Sushmaselenium1234";
		data[1][0] = "gummi1@gmail.com";
		data[1][1] = "Sushmaselenium1234";
		data[2][0] = "sam1@gmail.com";
		data[2][1] = "Sushmaselenium1234";
		
		return data;
	}
	
	@DataProvider
	public Object[][]  elorusAddContactData() throws Throwable {
		String elorusExcel = "./data/ElorusData.xlsx";

		Object[][] data = new Object[1][6];
		data[0][0] = p4.getData(elorusExcel, "elorus", 1, 1);
		data[0][1] = p4.getData(elorusExcel, "elorus", 1, 2);
		data[0][2] = p4.getData(elorusExcel, "elorus", 1, 3);
		data[0][3] = p4.getData(elorusExcel, "elorus", 1, 4);
		data[0][4] = p4.getData(elorusExcel, "elorus", 1, 5);
		data[0][5] = p4.getData(elorusExcel, "elorus", 1, 6);
		
		return data;
	}

}
