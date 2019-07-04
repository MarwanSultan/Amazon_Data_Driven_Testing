package amazon.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazon.util.BaseTest;

public class OrdersPage extends BaseTest {

	WebDriver driver;

	public OrdersPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "#yourOrdersContent > div.a-row > div:nth-child(1) > h1")
	WebElement yourOrders;

	@FindBy(id = "searchOrdersInput")
	WebElement searchOrdersField;

	@FindBy(css = "#nav-link-prime > span.nav-line-2")
	WebElement tryPrime;

	///////////////////////////////////////////////////////////////
	public void verifyOrdersPage() {

		yourOrders.getText().equals("Your Orders");

	}

	public void searchHistory(String prod) {
		this.searchOrdersField.sendKeys(prod);
		this.searchOrdersField.sendKeys(Keys.ENTER);

	}

	///////////////////////////////////////////////

	public void primeFeatures() {
		tryPrime.click();

	}

	public WebElement getYourOrders() {
		return yourOrders;
	}

	public void setYourOrders(WebElement yourOrders) {
		this.yourOrders = yourOrders;
	}

	public WebElement getSearchOrdersField() {
		return searchOrdersField;
	}

	public void setSearchOrdersField(WebElement searchOrdersField) {
		this.searchOrdersField = searchOrdersField;
	}

	public OrdersPage() {
		// TODO Auto-generated constructor stub
	}

}
