package Org.qsp.testngdemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(LIsttDemo.class)
public class DemoList {
	@Test
	public void m1() {
		Reporter.log("Hi", true);
	}

	@Test
	public void m2() {
		Reporter.log("Hii2", true);
		Assert.fail();
	}

}
