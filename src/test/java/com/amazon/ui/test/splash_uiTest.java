package com.amazon.ui.test;

import org.testng.annotations.Test;

import com.amazon.ui.page.AmazonHome;
import com.amazon.ui.resources.BaseTest;

public class splash_uiTest extends BaseTest {

	AmazonHome a;

	@Test(priority = 2, description = "Validate the footer is present.")
	public void pageValidation() {

		AmazonHome a = new AmazonHome(driver);
		a.uiFooter();

	}

	public splash_uiTest() {
		// TODO Auto-generated constructor stub
	}

}
