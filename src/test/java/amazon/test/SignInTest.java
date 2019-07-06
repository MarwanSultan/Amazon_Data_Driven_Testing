package amazon.test;

import org.testng.annotations.Test;

import amazon.page.AmazonHome;
import amazon.page.SignInPage;
import amazon.util.BaseTest;

public class SignInTest extends BaseTest {

	AmazonHome a;

	SignInPage s;

	@Test(priority = 0, description = "Execute a 'Negative' login test")
	public void sigInValidation() {
		AmazonHome a = new AmazonHome(driver);
		a.clickSignInButton();

		SignInPage s = new SignInPage(driver);
		s.signInProcess("automationTester@a.com", "abc123");

	}

	public SignInTest() {
		// TODO Auto-generated constructor stub
	}

}