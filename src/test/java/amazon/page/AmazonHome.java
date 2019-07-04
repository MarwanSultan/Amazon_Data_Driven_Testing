package amazon.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import amazon.util.BaseTest;

public class AmazonHome extends BaseTest {

	WebDriver driver;

	WebDriverWait wait;

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchBox;

	@FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
	WebElement signInButton;

	@FindBy(css = "#nav-link-prime")
	WebElement tryPrimeLink;

	@FindBy(css = "#nav-orders > span.nav-line-2")
	WebElement orderslink;

	@FindBy(id = "navFooter")
	WebElement amazonFooter;

	@FindBy(id = "div#nav-logo")
	WebElement amazonLogo;

	///////////////////////////////////////////////
	public AmazonHome(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	//////////////////////////////////////////////////

	// ----------------------------------------------------------------------------------

	/////////////////// METHODS//////////////////////////////////////////

	public void itemSearch(String var) {

		searchBox.sendKeys(var);
		searchBox.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void clickSignInButton() {

		signInButton.click();

		return;

	}

	public void clickOrdersButton() {

		orderslink.click();
		return;

	}
	public void alphaSearch(String var) {
		itemSearch(var);

		return;
	}

	public void uiFooter() {

		amazonFooter.isDisplayed();

		return;
	}

	public void clicktryPrimeButton() {

		tryPrimeLink.click();

		return;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	//////////////////////////////////////////////////////////////

	public void signInPage() {

		return;

	}

}