
package amazon.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazon.util.BaseTest;

public class CreateAccountPage extends BaseTest {

	@FindBy(id = "ap_customer_name")
	WebElement firstNameField;

	@FindBy(id = "ap_email")
	WebElement emailAddress;

	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(id = "ap_password_check")
	WebElement confirmPassword;

	///////////////////////////////////////////////
	public CreateAccountPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	//////////////////////////////////////////////////

	public void loopElements() {

		List<WebElement> editFields = driver
				.findElements(By.className("a-input-text"));

		System.out.println("LOOP STARTED!!!");

		for (WebElement item : editFields) {
			if (item.isEnabled()) {

				item.sendKeys("ABC123");

			}
		}

		System.out.println("LOOP ENDED!!!");
	}

}