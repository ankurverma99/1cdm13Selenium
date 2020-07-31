package Org.qsp.testngdemo;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	@Test
	public void m1() {
		String aName = "Ankur";
		String eName = "Ankur";
		Assert.assertEquals(aName, eName);
		System.out.println("matched");

		List<String> lst1 = new ArrayList<String>();
		lst1.add("abc");
		lst1.add("Admin");
		lst1.add("xyz");

		List<String> lst2 = new ArrayList<String>();
		lst2.add("abc");
		lst2.add("Admin");
		lst2.add("xyz");

		Assert.assertEquals(lst1, lst2);
		System.out.println("List is matched");

		int i = 9, j = 9;
		Assert.assertEquals(i, j);

		Assert.assertEquals(true, false);

	}

}
