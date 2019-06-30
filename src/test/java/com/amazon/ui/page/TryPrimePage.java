package com.amazon.ui.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.ui.resources.BaseTest;

public class TryPrimePage extends BaseTest {

	WebDriver driver;

	// ------------------------------------------------------
	@FindBy(linkText = "TRY PRIME")
	WebElement tryPrime;

	public TryPrimePage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	// ------------------------------------------------------

	// ======================================================

	public void TryPrimeLink_Visible() {
		tryPrime.click();

	}

	public TryPrimePage() {
		// TODO Auto-generated constructor stub
	}

	// ======================================================

}
