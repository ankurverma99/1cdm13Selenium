package Org.qsp.testngdemo;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@DataProvider
	public String[][] getData() {
		String st[][] = new String[3][3];
		st[0][0] = "Ankit";
		st[0][1] = "ankit@123";
		st[0][2] = "ankit@gmail.com";

		st[1][0] = "Alia";
		st[1][1] = "Alia@12";
		st[1][2] = "alia@gmail.com";

		st[2][0] = "admin";
		st[2][1] = "manager";
		st[2][2] = "admin@gmai.com";

		return st;
	}

	@Test(dataProvider = "getData")
	public void m1(String un, String pw, String email) {
		Reporter.log(un + " " + pw + "  " + email, true);
	}

}
