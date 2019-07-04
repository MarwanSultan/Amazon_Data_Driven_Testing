package amazon.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import amazon.page.AmazonHome;

public class BaseTest {

	protected WebDriver driver;

	WebDriverWait wait;

	AmazonHome a;

	@BeforeMethod
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.getTitle().equals(
				"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs &amp; more");

		/*
		 * System.out.println("TEST INITIALIZED!!!!");
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement
		 * element = wait.until(ExpectedConditions
		 * .visibilityOfElementLocated(By.xpath("#twotabsearchtextbox")));
		 * 
		 * boolean status = element.isDisplayed();
		 * 
		 * if (status) { System.out.println(
		 * "============Initialization Passed===================");
		 * 
		 * } else System.out.println(
		 * "============Initialization Failed===================");
		 */
	}

	@AfterMethod
	public void afterClass() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.close();
		System.out.println("TEST PASSED!!!");
	}

	protected WebDriver getDriver() {
		return driver;

	}

	public void onTestFailure1(ITestResult iTestResult) {
		// TODO Auto-generated method stub

	}

}
