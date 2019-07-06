package dataDriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import amazon.page.AmazonHome;
import amazon.util.BaseTest;

public class DDT extends BaseTest {

	AmazonHome a;

	@DataProvider(name = "injectData")
	public Object[][] myDataProvider() {
		Object[][] obj = new Object[4][1];

		obj[0][0] = "Computer Desk";

		obj[1][0] = "HiTech computer mouse";

		obj[2][0] = "Air conditioner";

		obj[3][0] = "Dewalt Power drill";

		return obj;

	}

	@Test(dataProvider = "injectData")
	public void enhance(String var) {
		AmazonHome a = new AmazonHome(driver);
		a.itemSearch("Alexa");

	}

}
