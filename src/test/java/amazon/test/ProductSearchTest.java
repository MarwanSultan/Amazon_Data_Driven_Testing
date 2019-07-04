package amazon.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import amazon.page.AmazonHome;
import amazon.util.BaseTest;

public class ProductSearchTest extends BaseTest {

	AmazonHome a;

	int i;

	@DataProvider(name = "myData1")
	public Object[][] myDataProvider1() {
		Object[][] obj = new Object[7][1];

		obj[0][0] = "Samsung Television";

		obj[1][0] = "power tools";

		obj[2][0] = "Large Computer Monitors";

		obj[3][0] = "Redskins";

		obj[4][0] = "Dyson";

		obj[5][0] = "Transparent monitor";

		obj[6][0] = "Computer desk";

		return obj;
	}

	@Test(dataProvider = "myData1")
	public void randomSearch(String var) {
		AmazonHome a = new AmazonHome(driver);
		a.itemSearch(var);

	}

}