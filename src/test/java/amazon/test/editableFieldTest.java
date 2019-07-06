package amazon.test;

import org.testng.annotations.Test;

import amazon.page.AmazonHome;
import amazon.page.CreateAccountPage;
import amazon.page.SignInPage;
import amazon.util.BaseTest;

public class editableFieldTest extends BaseTest {

	AmazonHome a;

	SignInPage sp;

	CreateAccountPage c;

	@Test
	public void createAccess() throws Throwable {

		AmazonHome a = new AmazonHome(driver);

		Thread.sleep(4000);
		a.clickSignInButton();

		// Thread.sleep(3000);

		SignInPage sp = new SignInPage(driver);
		sp.clickCreateAccount();

		// Thread.sleep(3000);

		CreateAccountPage c = new CreateAccountPage(driver);
		c.loopElements();

	}

}
