package Org.qsp.testngdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {

	@Test(groups = "functional")
	public void m1() {
		Reporter.log("Hiiii...1", true);
	}

	@Test(groups = "intigration", dependsOnGroups = "functional")
	public void m2() {
		Reporter.log("Hiiii...2", true);
	}

	@Test(groups = "functional")
	public void m3() {
		Reporter.log("Hiiii...3", true);
	}

	@Test(groups = "intigration", dependsOnGroups = { "functional", "Unit" })
	public void m4() {
		Reporter.log("Hiiii...4", true);
	}

	@Test(groups = "functional")
	public void m5() {
		Reporter.log("Hiiii...5", true);
	}

	@Test(groups = "Unit")
	public void m6() {
		Reporter.log("Hiiii...6", true);

	}

}
