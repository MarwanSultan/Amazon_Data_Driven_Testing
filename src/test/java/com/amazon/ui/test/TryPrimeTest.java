package com.amazon.ui.test;

import org.testng.annotations.Test;

import com.amazon.ui.page.AmazonHome;
import com.amazon.ui.page.TryPrimePage;
import com.amazon.ui.resources.BaseTest;

public class TryPrimeTest extends BaseTest {

	AmazonHome a;

	TryPrimePage t;

	@Test(priority = 1, description = "Verify the user can select the 'tryPrime link.")
	public void clicktryPrimeLink() {

		AmazonHome a = new AmazonHome(driver);
		a.clicktryPrimeButton();

		TryPrimePage t = new TryPrimePage(driver);
		t.TryPrimeLink_Visible();
	}

	public TryPrimeTest() {
		// TODO Auto-generated constructor stub
	}

}
