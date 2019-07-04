package amazon.test;

import org.testng.annotations.Test;

import amazon.page.AmazonHome;
import amazon.page.signInPage;
import amazon.util.BaseTest;

public class SignInTest extends BaseTest {

	AmazonHome a;

	signInPage s;

	@Test(priority = 0, description = "Execute a 'Negative' login test")
	public void sigInValidation() {
		AmazonHome a = new AmazonHome(driver);
		a.clickSignInButton();

		signInPage s = new signInPage(driver);
		s.signInProcess("automationTester@a.com", "abc123");

	}

	public SignInTest() {
		// TODO Auto-generated constructor stub
	}

}