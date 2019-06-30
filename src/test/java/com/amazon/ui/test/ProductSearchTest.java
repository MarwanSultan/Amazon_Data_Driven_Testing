package com.amazon.ui.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amazon.ui.page.AmazonHome;
import com.amazon.ui.resources.BaseTest;

public class ProductSearchTest extends BaseTest {

	AmazonHome ah;
	int i;

	@DataProvider(name = "myData1")
	public Object[][] myDataProvider1() {
		Object[][] obj = new Object[4][1];

		obj[0][0] = "Samsung Television";

		obj[1][0] = "power tools";

		obj[2][0] = "Large Computer Monitors";

		obj[3][0] = "Redskins";

		return obj;
	}

	@Test(dataProvider = "myData1")
	public void randomSearch(String var) {
		AmazonHome ah = new AmazonHome(getDriver());
		System.out.println("");
		ah.itemSearch(var);

	}

}