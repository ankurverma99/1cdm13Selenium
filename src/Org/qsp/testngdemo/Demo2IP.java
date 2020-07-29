package Org.qsp.testngdemo;

import org.testng.annotations.Test;

public class Demo2IP {

	@Test
	public void m1() {
		System.out.println("hi1");
	}

	@Test(dependsOnMethods = "m3")
	public void m2() {
		System.out.println("hi2");
	}

	@Test
	public void m3() {
		System.out.println("hi3");
	}
}
