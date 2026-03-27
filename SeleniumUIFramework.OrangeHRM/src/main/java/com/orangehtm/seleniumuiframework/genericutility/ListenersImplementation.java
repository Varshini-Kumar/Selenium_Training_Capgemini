package com.orangehtm.seleniumuiframework.genericutility;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListenersImplementation  implements ITestListener{

	ExtentReports extent = new ExtentReports();
	//ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/test_result.html");
	//ExtentTest test;
	ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
	WebDriver driver;
	

	@Override
	public void onTestStart(ITestResult result) {
	ExtentTest et = extent.createTest(result.getMethod().getMethodName());
	test.set(et);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.get().pass("Test Status : Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.get().fail("Test Status : Fail");
		test.get().fail(result.getThrowable());
		Object obj = result.getInstance();
		BaseClass bsc = (BaseClass)obj;
		WebDriver driver = bsc.driver;
		ScreenShotUtility sc = new ScreenShotUtility();
		try {
			sc.captureScreenshot(driver,result.getMethod().getMethodName());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.get().skip("Test Status : Skip");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	

}
