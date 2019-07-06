package amazon.page;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import amazon.util.BaseTest;

public class SignInPage extends BaseTest implements WebDriver {

	public SignInPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	// ELEMENTS USED/////////////////////////////////////////

	@FindBy(id = "createAccountSubmit")
	WebElement createAccountButton;

	@FindBy(id = "ap_email")
	WebElement emailField;

	@FindBy(id = "ap_password")
	WebElement passwordField;

	@FindBy(id = "signInSubmit")
	WebElement signInButton;

	@FindBy(css = "h4.a-alert-heading")
	WebElement errorMessage;

	/////////////////////////////////////////////////////////

	//// PAGE METHODS////////////////////////////////

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

	public void clickCreateAccount() throws Throwable {
		WebDriverWait wait = new WebDriverWait(this, 30);
		wait.until(
				ExpectedConditions.elementToBeClickable(createAccountButton));

		this.createAccountButton.click();
		Thread.sleep(5000);

	}

	public void SignInTitle() {
		assertTrue(driver.getTitle().contains("Amazon Sign-In"));

	}

	/////////////////////////////////////////////////////////

	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}

	public void setCreateAccountButton(WebElement createAccountButton) {
		this.createAccountButton = createAccountButton;
	}

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

	public SignInPage() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}

}
