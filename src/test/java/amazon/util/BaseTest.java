package amazon.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import amazon.page.AmazonHome;

public class BaseTest implements IInvokedMethodListener {

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

	}

	@AfterMethod
	public void afterClass(ITestResult testResult) {

		System.out.println(testResult.getMethod().getMethodName());

		if (testResult.getStatus() == ITestResult.FAILURE) {

			System.out
					.println("Failed" + testResult.getMethod().getMethodName());

		}

		if (testResult.getStatus() == ITestResult.SUCCESS) {

			System.out.println("Successful" + testResult.getName());

		}

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

	@Override
	public void beforeInvocation(IInvokedMethod method,
			ITestResult testResult) {
		// TODO Auto-generated method stub

		System.out.println(
				"BEFORE INVOCATION" + testResult.getTestClass().getName()
						+ " =>" + method.getTestMethod().getMethodName());
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println(
				"AFTER INVOCATION" + testResult.getTestClass().getName() + " =>"
						+ method.getTestMethod().getMethodName());

	}
}
