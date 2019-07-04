package amazon.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import amazon.page.AmazonHome;
import amazon.page.TryPrimePage;
import amazon.util.BaseTest;

public class TryPrimeTest extends BaseTest {

	AmazonHome a;

	TryPrimePage t;

	@Test
	public void clicktryPrimeLink() {

		AmazonHome a = new AmazonHome(driver);
		a.clicktryPrimeButton();

		TryPrimePage t = new TryPrimePage(driver);

		t.TryPrimeLink_Visible();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public TryPrimeTest() {
		// TODO Auto-generated constructor stub
	}

}
