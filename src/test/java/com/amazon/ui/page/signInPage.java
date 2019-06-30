package com.amazon.ui.page;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.ui.resources.BaseTest;

public class signInPage extends BaseTest {

	public signInPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ap_email")
	WebElement emailField;

	@FindBy(id = "ap_password")
	WebElement passwordField;

	@FindBy(id = "signInSubmit")
	WebElement signInButton;

	@FindBy(id = "auth-error-message-box")
	WebElement errorMessage;

	public void enterEmailAddress(String email) {
		this.emailField.sendKeys(email);

		return;
	}

	public void enterPassword(String pass) {
		this.passwordField.sendKeys(pass);

		return;

	}

	public void ClickSignInButton() {
		signInButton.click();

	}

	public void signInProcess(String email, String pass) {

		enterEmailAddress(email);
		enterPassword(pass);
		ClickSignInButton();
		errorMessage.isDisplayed();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	public void SignInTitle() {
		assertTrue(driver.getTitle().contains("Amazon Sign-In"));

	}

	//////////////////////////////////////////

	protected WebElement getEmailField() {
		return emailField;
	}

	protected void setEmailField(WebElement emailField) {
		this.emailField = emailField;
	}

	protected WebElement getPasswordField() {
		return passwordField;
	}

	protected void setPasswordField(WebElement passwordField) {
		this.passwordField = passwordField;
	}

	protected WebElement getSignInButton() {
		return signInButton;
	}

	protected void setSignInButton(WebElement signInButton) {
		this.signInButton = signInButton;
	}

	protected WebElement getErrorMessage() {
		return errorMessage;
	}

	protected void setErrorMessage(WebElement errorMessage) {
		this.errorMessage = errorMessage;
	}

	public signInPage() {
		// TODO Auto-generated constructor stub
	}

}
